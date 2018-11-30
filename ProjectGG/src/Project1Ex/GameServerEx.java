package Project1Ex;

import java.awt.geom.Point2D;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Ŭ���̾�Ʈ�� �����ϸ� ��ſ� ������� ��� �����ڿ��� �ֱ������� ���� �����͸� �����ϴ� �����带 �����Ѵ�
 */
public class GameServerEx {
	// ���ӵ� ����� ����
	static List<UserConnection> userList = new ArrayList<>();
	// ��� �̿����� ȭ�鿡�� �̵� ���� ��ź�� ��ǥ ����Ʈ(��� �̿��ڿ��� ���۵�)
	static List<Point2D> bulletList = new LinkedList<>();
	// ��� �̿��ڵ��� ��Ʈ ���� �ʿ� �����Ͽ� �� �̿��ڵ鿡�� ������ �� �����
	static Map<String, Integer> pointMap = new HashMap<>();

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			ServerLoopThread loop = null;
			UserConnection user = null;
			while (true) {
				System.out.println("���� ��� ��...");
				Socket socket = ss.accept();
				// ��ſ� ������ �̿��Ͽ� �����ڿ� ������ ����ϱ� ���� ��Ʈ���� ������
				user = new UserConnection(socket);
				// �̿��ڷκ��� �Էµ� �̺�Ʈ ������ ���� �����͸� �����ϴ� ������
				new UserThread(user).start();
				// ��� �̿��ڿ��� ��ε�ĳ������ �� ���� �̿������� ����Ʈ
				userList.add(user);
				if (loop == null) {
					// ��� �����ڿ��� �ֱ������� ���� ��ġ�� ������ ȭ�� ������ �����Ѵ�
					// ���������� Ŭ���̾�Ʈ���� ����ϴ� ���
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
 * ���� ��ǥ�� �����ϰ� �̿����� ���� �����Ϳ� ���� �浹���θ� �˻��ϸ� ��� Ŭ���̾�Ʈ���� ���� ����ǥ�� �浹���θ� �ֱ������� �۽��ϴ�
 * ������ ������
 */
class ServerLoopThread extends Thread {
	@Override
	public void run() {
		Ball ball = new Ball(1, 50, 1, 0);

		System.out.println("���� ���ӷ��� ����...");
		UserConnection user = null;
		Point2D bulletPos = null;

		long prevTime = 0;
		long currTime = 0;
		// ������ ���� ����(��� �̿��ڿ��� ���� ���� ��ġ�� ������ ��ź�� ��ġ�� �۽��Ѵ�)
		while (true) {
			// ���� ���� �ֱ� Ȯ�ο� �׽�Ʈ �ڵ�
			currTime = System.currentTimeMillis();
			if (prevTime == 0)
				prevTime = currTime;
			else {
				// System.out.printf("�������� �ֱ�:%d %n", currTime-prevTime);
				prevTime = currTime;
			}

			ball.move(); // ���� ��ǥ�� �����Ѵ�

			// ��� �̿����� ��ź��ǥ�� ��Ʈ ���� ��� �ٸ� �̿����� ȭ�鿡�� �������� �ϹǷ�
			// �� �̿����� �̵� ���� ��ź�� ��ǥ�� ��Ʈ ���� ����Ʈ�� �ʿ� �����Ͽ� ��� �̿��ڿ��� �����ؾ� �Ѵ�
			// ��ź��ǥ ����Ʈ�� ��Ʈ���� �����ϴ� �ʿ��� ��� ���Ҹ� �����ϰ� �ٽ� ä���
			GameServerEx.bulletList.clear();
			GameServerEx.pointMap.clear();
			// ȭ�鿡�� �̿� ���� ��� �̿��ڵ��� ��ź��ǥ�� ��Ʈ ���� �����Ͽ� ����Ʈ�� ���� ���� ä���
			String winner = null;
			for (int i = 0; i < GameServerEx.userList.size(); i++) {
				user = GameServerEx.userList.get(i);
				// �� �̿����� ��Ʈ���� �����Ͽ� pointMap�� �����Ѵ�
				GameServerEx.pointMap.put(user.id, user.gd.hitCnt);
				if (user.gd.fired) {
					// �� �̿����� �̵� ���� ��ź��ǥ�� �����Ͽ� ����Ʈ�� �����Ѵ�
					GameServerEx.bulletList.add(user.gd.bulletPos);
				}
				if (user.gd.winner != null)
					winner = user.gd.winner;
			}

			// ���� ��ġ, ��ź�� ��ġ ���� ��� �̿��ڿ��� ��ε�ĳ��Ʈ
			try {
				for (int i = 0; i < GameServerEx.userList.size(); i++) {
					user = GameServerEx.userList.get(i);
					user.gd.ballPos.setLocation(ball.x, ball.y); // ���� ���� ��ġ ����
					user.gd.bulletList = GameServerEx.bulletList;
					user.gd.pointMap = GameServerEx.pointMap;
					if (winner != null)
						user.gd.winner = winner;
					if (user.gd.fired) { // �߻�� ��ź�� �ִٸ� ��ź�� ��ġ�� �����Ͽ� �̵��ϰ� �Ѵ�
						bulletPos = user.gd.bulletPos;
						bulletPos.setLocation(bulletPos.getX(), bulletPos.getY() - 3);
					}
					// ��� �����ڿ��� ����ȭ���� ������ �۽��Ѵ�
					while (true) {
						try {
							user.out.reset();// ����ȭ ���߿� ������ �ϸ� ����(stream active)�� �߻���
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
 * �����ڿ� ������ ���� �� �����ڿ� ����� ���� ��Ʈ�� ���̵�, ����, ������Ʈ �Է½�Ʈ��, ������Ʈ ��½�Ʈ��, �̿����� ���� ������
 * ���⼭ ������ ����� ��Ʈ���� ���������� ���������� ����ϸ�, �ٸ� �������� ��Ʈ�� ��ü�� ���� �������� ����
 */
class UserConnection {
	String id;
	Socket socket;
	ObjectInputStream oin;
	ObjectOutputStream out;
	// �� �̿��ڰ� ������ ������ ���� �����͸� ����
	GameData gd;

	public UserConnection() {
	}

	public UserConnection(Socket socket) {
		// �̿����� ���̵� ���ӽð����� ������
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
 * �̿����� Ű����, ���콺 �Է� ������ �������� �����ϴ� ������ �̿��ڷκ��� ���� ����
 */
class UserThread extends Thread {
	// �̿��ڷκ��� ������ ���۵� ���� �����ʹ� �ش� �̿����� ������ user.gd ������ ����Ǹ�,
	// user�� ������ GameServer.userList���� ����Ǿ� �����Ƿ� ���� ���ӷ����� ����
	// �ٸ� �̿��ڿ��� ���� �̿����� ���� �����͸� ������ �� ���ȴ�
	UserConnection user;

	UserThread(UserConnection user) {
		this.user = user;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// �̿��ڷκ��� ���� �����͸� �����Ͽ� �ش� �̿����� GameData ���������� ����
				user.gd = (GameData) user.oin.readObject();
			} catch (Exception e) {
				// e.printStackTrace();
				System.err.println("Ŭ���̾�Ʈ ����(����)\n");
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
 * Ŭ���̾�Ʈ�� ���� ���̿� ������ �����͸� ĸ��ȭ�� �ٸ� �����Ͱ� �� �ʿ��ϴٸ� ���� �߰������� �����ϸ� ��
 */
class GameData implements Serializable {
	String id; // �̿��� ���̵�
	// ���������� ��� ���� ��ġ
	Point2D ballPos = new Point2D.Double();
	// �̿��ڰ� Ű����� �����ϴ� �߻���� ��ġ
	Point2D gunPos = new Point2D.Double(-100, -100);
	// �ٸ� �÷��̾���� �߻��� ��ź�� ������ġ�� ������ ����Ʈ
	List<Point2D> bulletList = new LinkedList<>();
	// ���� ��ź ��ġ
	Point2D bulletPos = new Point2D.Double();
	boolean fired; // �߻��Ͽ� �̵����� �� true, �� �ܿ��� false
	boolean hit; // ���� ��ź�� �����ϸ� true
	boolean win; // �÷��̾ ����ϸ� true
	String winner; // ����� ���̵�
	int hitCnt; // ������ ��ź�� ��
	// ��� �̿����� ��Ʈ���� ������ ��(�̿��� ���̵�, ��Ʈ���� ������ ������)
	Map<String, Integer> pointMap = new HashMap<>();

	public GameData() {
	}

	public GameData(String userId) {
		this.id = userId;
	}
}

/**
 * ��� �������� ȭ�鿡�� �¿�� ������ �̵��ϴ� �� ���������� ���� ��ǥ�� �����ϰ� ��� �����ڿ��� �� ��ǥ�� �����ϸ� Ŭ���̾�Ʈ�� ��
 * ��ǥ�� �޾Ƽ� ȭ�鿡 �׸���.
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
