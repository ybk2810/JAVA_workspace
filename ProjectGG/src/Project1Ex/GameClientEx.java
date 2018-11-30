package Project1Ex;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 이 클래스는 클라이언트 게임 화면을 제공한다 이용자의 키보드 입력정보 등 게임 데이터를 서버로 전송할 ObjectOutputStream을
 * 사용한다 ObjectOutputStream을 사용하여 서버로 전송할 객체를 직렬화할 때 주의할 점이 있다 객체를 전송하기 위해 직렬화하는
 * 도중에 객체의 내용을 변경할 경우 서버측에서 OptionalDataException 이 발생하면서 이후에 스트림을 사용할 수 없게 된다.
 * 이런 이유로 발생한 OptionalDataException의 eof 속성값은 true 로 설정되므로 오류를 분석할 때 참고하면 된다 전송할
 * 객체의 내용을 변경하는 도중에는 직렬화 작업이 진행되지 않도록 해당 부분에 락을 설정해야 한다 아래의 코드에서 synchronized
 * 블럭을 사용한 것은 이와 같은 이유 때문이다
 */
public class GameClientEx extends JFrame {
	GamePanel gp;
	GameData gd; // 서버와 게임 데이터를 주고 받을 때 사용할 데이터 포맷
	ObjectOutputStream out;
	ObjectInputStream oin;
	boolean loop = true; // 클라이언트 측의 게임루프 실행/종료 결정

	public GameClientEx() {
		super("게임 클라이언트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 470, 470);
		getContentPane().setLayout(null);

		gp = new GamePanel(this);
		add(gp);

		connect();// 서버에 접속한다

		setVisible(true);
	}

	/** 서버연결에 성공하면 입출력 스림을 생성하고 입력 쓰레드를 실행한다 */
	private void connect() {
		try {
			Socket socket = new Socket("localhost", 1234);
			out = new ObjectOutputStream(socket.getOutputStream());
			oin = new ObjectInputStream(socket.getInputStream());
			// 서버로부터 게임 데이터를 수신하는 쓰레드
			new Thread() {
				@Override
				public void run() {
					Point2D ballPos = null;
					Point2D bulletPos = null;
					// 클라이언트 게임루프(서버측에서 주기적으로 게임 데이터를 전송할 때마다 1회의 루프가 실행된다)
					// 서버측에서는 매 33밀리초마다 접속자에게 게임 데이터를 송출함
					while (loop) {

						try {
							// 서버측에서 전송된 게임 데이터를 수신함
							gd = (GameData) oin.readObject();

							// 발사대의 위치 좌표를 게임 패널의 중앙 하단으로 초기화한다
							if (gd.gunPos.getX() == -100 && gd.gunPos.getY() == -100) {
								synchronized (gp) {
									gd.gunPos.setLocation(gp.x, gp.y);
								}
							}
							// 화면을 그린다
							gp.repaint();

							if (gd.winner != null)
								break;
							// 화면을 그린 후의 처리
							// 포탄이 화면 상단 영역에 도달한 경우
							if (gd.bulletPos.getY() < 0) {
								synchronized (gp) {
									gd.fired = false;
								}
								gp.sendGameData();
							}
							// 이용자가 발사한 포탄과 볼의 충돌검사
							if (gd.fired) {
								ballPos = gd.ballPos;
								bulletPos = gd.bulletPos;
								double xDist = (ballPos.getX() + 15) - (bulletPos.getX() + 5);
								double yDist = (ballPos.getY() + 15) - (bulletPos.getY() + 5);
								if ((xDist * xDist + yDist * yDist) <= (20 * 20)) {
									synchronized (gp) {
										gd.fired = false;
										gd.hit = true;
										gd.hitCnt++;
										if (gd.hitCnt == 10) {
											gd.win = true;
											gd.winner = gd.id;
										}
										gp.sendGameData();
									}
								}
							} else if (gd.hit) {
								synchronized (gp) {
									gd.hit = false;
								}
								gp.sendGameData();
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					} // end of client loop
				}
			}.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GameClientEx();
			}
		});
	}
}

class GamePanel extends JPanel {
	GameClientEx f;
	BufferedImage ballRed, ballOrange, gun, bulletRed, bulletWhite;
	int x, y; // gun 의 초기위치

	GamePanel(GameClientEx f) {
		this.f = f;
		// 게임에 사용될 몇가지 도형을 BufferedImage에 그린다
		ballRed = new BufferedImage(30, 30, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = (Graphics2D) ballRed.getGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.RED);
		g2d.fillOval(0, 0, 30, 30);
		g2d.dispose();

		ballOrange = new BufferedImage(30, 30, BufferedImage.TYPE_INT_ARGB);
		g2d = (Graphics2D) ballOrange.getGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.ORANGE);
		g2d.fillOval(0, 0, 30, 30);
		g2d.dispose();

		gun = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
		g2d = (Graphics2D) gun.getGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 10, 10);
		g2d.dispose();

		bulletRed = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
		g2d = (Graphics2D) bulletRed.getGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.RED);
		g2d.fillOval(0, 0, 10, 10);
		g2d.dispose();

		bulletWhite = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
		g2d = (Graphics2D) bulletWhite.getGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLACK);
		g2d.drawOval(0, 0, 10, 10);
		g2d.dispose();

		setBackground(Color.WHITE);
		setBounds(10, 10, 430, 400);
		setFocusable(true);
		requestFocus();

		x = getWidth() / 2 - 5;
		y = getHeight() - 10;

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_A) {
					if (f.gd.gunPos.getX() <= 0)
						return;
					synchronized (f.gd) {
						f.gd.gunPos.setLocation(f.gd.gunPos.getX() - 4, f.gd.gunPos.getY());
					}
				} else if (keyCode == KeyEvent.VK_D) {
					if (f.gd.gunPos.getX() >= getWidth() - 10)
						return;
					synchronized (f.gd) {
						f.gd.gunPos.setLocation(f.gd.gunPos.getX() + 4, f.gd.gunPos.getY());
					}
				} else if (keyCode == KeyEvent.VK_SPACE) {
					if (f.gd.fired) {
						return;
					} else {
						synchronized (f.gd) {
							f.gd.fired = true;
						}
					}
					Point2D gunPos = f.gd.gunPos;
					Point2D myBulletPos = f.gd.bulletPos;
					synchronized (f.gd) {
						myBulletPos.setLocation(gunPos.getX(), gunPos.getY() - 10);// 포탄 발사 위치 설정
					}
				}
				sendGameData();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (f.gd == null)
			return;

		BufferedImage ball = f.gd.hit ? ballRed : ballOrange;

		// 볼 그림
		g2d.drawImage(ball, (int) f.gd.ballPos.getX(), (int) f.gd.ballPos.getY(), null);

		// 발사대 초기화
		if (f.gd.gunPos.getX() == -100 && f.gd.gunPos.getY() == -100) {
			synchronized (this) {
				f.gd.gunPos.setLocation(x, y);
			}
		}

		// 발사대 그림
		g2d.drawImage(gun, (int) f.gd.gunPos.getX(), (int) f.gd.gunPos.getY(), null);

		// 나의 포탄 그림
		if (f.gd.fired) {
			Point2D bulletPos = f.gd.bulletPos;
			g2d.drawImage(bulletRed, (int) bulletPos.getX(), (int) bulletPos.getY(), null);
		}

		// 다른 플레이어의 포탄을 그린다
		for (int i = 0; i < f.gd.bulletList.size(); i++) {
			Point2D otherBulletPos = f.gd.bulletList.get(i);
			// 리스트에 포함된 정보가 나의 포탄의 위치일 경우에는 그리지 않는다(위에서 그렸기 때문에)
			if (f.gd.bulletPos.equals(otherBulletPos))
				continue;
			g2d.drawImage(bulletWhite, (int) otherBulletPos.getX(), (int) otherBulletPos.getY(), null);
		}

		// 나의 포탄이 볼에 명중한 횟수(나의 점수) 출력
		g2d.drawString("HIT:" + f.gd.hitCnt, 5, 25);

		// 다른 이용자의 히트수 출력
		synchronized (this) {
			f.gd.pointMap.remove(f.gd.id); // 나의 히트 수는 맵에서 제거한다(위에서 출력했으므로)
		}
		String[] id = f.gd.pointMap.keySet().toArray(new String[f.gd.pointMap.size()]);
		for (int i = 0; i < id.length; i++) {
			// 다른 이용자의 점수를 출력하는 위치에 나의 점수는 출력하지 않는다
			g2d.drawString(id[i] + " HIT:" + f.gd.pointMap.get(id[i]), 300, 15 * (i + 1));
		}

		// 히트 수 10개에 가장 먼저 도달한 경우 우승한다
		if (f.gd.win || f.gd.winner != null) { // 누군가가 우승한 경우
			String fileName = f.gd.win ? "win.png" : "lose.png";
			InputStream is = getClass().getResourceAsStream(fileName);
			try {
				BufferedImage winImg = ImageIO.read(is);
				int x = getWidth() / 2 - (winImg.getWidth() / 2);
				int y = getHeight() / 2 - (winImg.getHeight() / 2);
				g2d.drawImage(winImg, x, y, null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			f.loop = false;
			return;
		}
	}

	long prevTime, currTime;

	public void sendGameData() {
		/*
		 * if(prevTime==0) prevTime = System.currentTimeMillis(); else { currTime =
		 * System.currentTimeMillis(); if(prevTime+waitTime>currTime) return; else
		 * prevTime = currTime; }
		 */
		try {
			while (true) {
				try {
					f.out.reset(); // 직렬화 도중에 호출되면 오류발생
					break;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			synchronized (this) {
				f.out.writeObject(f.gd);
			}
			f.out.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}