package Project1Ex;

import java.awt.geom.Point2D;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * 클라이언트가 접속하면 통신용 쓰레드와 모든 접속자에게 주기적으로 게임 데이터를 전달하는 쓰레드를 실행한다
 */
public class GameServerEx {
	// 접속된 사용자 정보
	static List<UserConnection> userList = new ArrayList<>();
	// 모든 이용자의 화면에서 이동 중인 포탄의 좌표 리스트(모든 이용자에게 전송됨)
	static List<Point2D> bulletList = new LinkedList<>();
	// 모든 이용자들의 히트 수를 맵에 저장하여 각 이용자들에게 전송할 때 사용함
	static Map<String, Integer> pointMap = new HashMap<>();

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			ServerLoopThread loop = null;
			UserConnection user = null;
			while (true) {
				System.out.println("서버 대기 중...");
				Socket socket = ss.accept();
				// 통신용 소켓을 이용하여 접속자와 서버가 통신하기 위한 스트림을 생성함
				user = new UserConnection(socket);
				// 이용자로부터 입력된 이벤트 정보와 게임 데이터를 수신하는 쓰레드
				new UserThread(user).start();
				// 모든 이용자에게 브로드캐스팅할 때 사용될 이용자정보 리스트
				userList.add(user);
				if (loop == null) {
					// 모든 접속자에게 주기적으로 볼의 위치와 상대방의 화면 정보를 전송한다
					// 서버측에서 클라이언트에게 출력하는 기능
					loop = new ServerLoopThread();
					loop.start();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * 볼의 좌표를 변경하고 이용자의 게임 데이터와 볼의 충돌여부를 검사하며 모든 클라이언트에게 볼의 새좌표와 충돌여부를 주기적으로 송신하는
 * 서버측 쓰레드
 */
class ServerLoopThread extends Thread {
	@Override
	public void run() {
		Ball ball = new Ball(1, 50, 1, 0);

		System.out.println("서버 게임루프 시작...");
		UserConnection user = null;
		Point2D bulletPos = null;

		long prevTime = 0;
		long currTime = 0;
		// 서버측 게임 루프(모든 이용자에게 현재 볼의 위치와 상대방의 포탄의 위치를 송신한다)
		while (true) {
			// 서버 루프 주기 확인용 테스트 코드
			currTime = System.currentTimeMillis();
			if (prevTime == 0)
				prevTime = currTime;
			else {
				// System.out.printf("서버루프 주기:%d %n", currTime-prevTime);
				prevTime = currTime;
			}

			ball.move(); // 볼의 좌표를 변경한다

			// 모든 이용자의 포탄좌표와 히트 수는 모든 다른 이용자의 화면에도 보여져야 하므로
			// 각 이용자의 이동 중인 포탄의 좌표와 히트 수를 리스트와 맵에 저장하여 모든 이용자에게 전달해야 한다
			// 포탄좌표 리스트와 히트수를 저장하는 맵에서 모든 원소를 삭제하고 다시 채운다
			GameServerEx.bulletList.clear();
			GameServerEx.pointMap.clear();
			// 화면에서 이용 중인 모든 이용자들의 포탄좌표와 히트 수를 취합하여 리스트와 맵을 새로 채운다
			String winner = null;
			for (int i = 0; i < GameServerEx.userList.size(); i++) {
				user = GameServerEx.userList.get(i);
				// 각 이용자의 히트수를 취합하여 pointMap에 저장한다
				GameServerEx.pointMap.put(user.id, user.gd.hitCnt);
				if (user.gd.fired) {
					// 각 이용자의 이동 중인 포탄좌표를 취합하여 리스트에 저장한다
					GameServerEx.bulletList.add(user.gd.bulletPos);
				}
				if (user.gd.winner != null)
					winner = user.gd.winner;
			}

			// 볼의 위치, 포탄의 위치 등을 모든 이용자에게 브로드캐스트
			try {
				for (int i = 0; i < GameServerEx.userList.size(); i++) {
					user = GameServerEx.userList.get(i);
					user.gd.ballPos.setLocation(ball.x, ball.y); // 현재 볼의 위치 저장
					user.gd.bulletList = GameServerEx.bulletList;
					user.gd.pointMap = GameServerEx.pointMap;
					if (winner != null)
						user.gd.winner = winner;
					if (user.gd.fired) { // 발사된 포탄이 있다면 포탄의 위치를 변경하여 이동하게 한다
						bulletPos = user.gd.bulletPos;
						bulletPos.setLocation(bulletPos.getX(), bulletPos.getY() - 3);
					}
					// 모든 접속자에게 게임화면의 정보를 송신한다
					while (true) {
						try {
							user.out.reset();// 직렬화 도중에 리셋을 하면 오류(stream active)가 발생함
							break;
						} catch (IOException ioe) {
						}
					}
					user.out.writeObject(user.gd);
					user.out.flush();
				}

				Thread.sleep(33);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * 접속자와 관련한 정보 및 접속자와 통신을 위한 스트림 아이디, 소켓, 오브젝트 입력스트림, 오브젝트 출력스트림, 이용자의 게임 데이터
 * 여기서 생성된 입출력 스트림을 서버측에서 지속적으로 사용하며, 다른 곳에서는 스트림 객체를 전혀 생성하지 않음
 */
class UserConnection {
	String id;
	Socket socket;
	ObjectInputStream oin;
	ObjectOutputStream out;
	// 한 이용자가 서버로 전송한 게임 데이터를 저장
	GameData gd;

	public UserConnection() {
	}

	public UserConnection(Socket socket) {
		// 이용자의 아이디를 접속시간으로 설정함
		this.id = String.valueOf(new Date().getTime());
		gd = new GameData(this.id);
		this.socket = socket;
		try {
			oin = new ObjectInputStream(socket.getInputStream());
			out = new ObjectOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * 이용자의 키보드, 마우스 입력 정보를 서버에서 수신하는 쓰레드 이용자로부터 게임 수신
 */
class UserThread extends Thread {
	// 이용자로부터 서버로 전송된 게임 데이터는 해당 이용자의 서버측 user.gd 변수에 저장되며,
	// user의 참조는 GameServer.userList에도 저장되어 있으므로 서버 게임루프를 통해
	// 다른 이용자에게 현재 이용자의 게임 데이터를 전달할 때 사용된다
	UserConnection user;

	UserThread(UserConnection user) {
		this.user = user;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// 이용자로부터 게임 데이터를 수신하여 해당 이용자의 GameData 참조변수에 저장
				user.gd = (GameData) user.oin.readObject();
			} catch (Exception e) {
				// e.printStackTrace();
				System.err.println("클라이언트 오류(퇴장)\n");
				if (e instanceof OptionalDataException) {
					OptionalDataException ode = (OptionalDataException) e;
					System.out.printf("e.length:%d, e.eof:%b %n", ode.length, ode.eof);
				}
				GameServerEx.userList.remove(user);
				break;
			}
		}
	}
}

/**
 * 클라이언트와 서버 사이에 오가는 데이터를 캡슐화함 다른 데이터가 더 필요하다면 여기 추가적으로 선언하면 됨
 */
class GameData implements Serializable {
	String id; // 이용자 아이디
	// 서버측에서 운용 볼의 위치
	Point2D ballPos = new Point2D.Double();
	// 이용자가 키보드로 조종하는 발사대의 위치
	Point2D gunPos = new Point2D.Double(-100, -100);
	// 다른 플레이어들이 발사한 포탄의 현재위치를 저장할 리스트
	List<Point2D> bulletList = new LinkedList<>();
	// 나의 포탄 위치
	Point2D bulletPos = new Point2D.Double();
	boolean fired; // 발사하여 이동중일 때 true, 그 외에는 false
	boolean hit; // 볼에 포탄이 명중하면 true
	boolean win; // 플레이어가 우승하면 true
	String winner; // 우승자 아이디
	int hitCnt; // 명중한 포탄의 수
	// 모든 이용자의 히트수를 저장할 맵(이용자 아이디, 히트수를 쌍으로 저장함)
	Map<String, Integer> pointMap = new HashMap<>();

	public GameData() {
	}

	public GameData(String userId) {
		this.id = userId;
	}
}

/**
 * 모든 접속자의 화면에서 좌우로 무한히 이동하는 볼 서버측에서 볼의 좌표를 변경하고 모든 접속자에게 그 좌표를 전송하면 클라이언트는 그
 * 좌표를 받아서 화면에 그린다.
 */
class Ball {
	double x, y;
	double xSpeed, ySpeed;

	Ball() {
	}

	Ball(double x, double y, double xSpeed, double ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	void move() {
		x += xSpeed;
		if (x >= 400) {
			x = 400;
			xSpeed = -xSpeed;
		} else if (x <= 0) {
			x = 0;
			xSpeed = -xSpeed;
		}
	}
}
