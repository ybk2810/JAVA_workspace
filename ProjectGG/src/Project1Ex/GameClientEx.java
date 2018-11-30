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
 * �� Ŭ������ Ŭ���̾�Ʈ ���� ȭ���� �����Ѵ� �̿����� Ű���� �Է����� �� ���� �����͸� ������ ������ ObjectOutputStream��
 * ����Ѵ� ObjectOutputStream�� ����Ͽ� ������ ������ ��ü�� ����ȭ�� �� ������ ���� �ִ� ��ü�� �����ϱ� ���� ����ȭ�ϴ�
 * ���߿� ��ü�� ������ ������ ��� ���������� OptionalDataException �� �߻��ϸ鼭 ���Ŀ� ��Ʈ���� ����� �� ���� �ȴ�.
 * �̷� ������ �߻��� OptionalDataException�� eof �Ӽ����� true �� �����ǹǷ� ������ �м��� �� �����ϸ� �ȴ� ������
 * ��ü�� ������ �����ϴ� ���߿��� ����ȭ �۾��� ������� �ʵ��� �ش� �κп� ���� �����ؾ� �Ѵ� �Ʒ��� �ڵ忡�� synchronized
 * ���� ����� ���� �̿� ���� ���� �����̴�
 */
public class GameClientEx extends JFrame {
	GamePanel gp;
	GameData gd; // ������ ���� �����͸� �ְ� ���� �� ����� ������ ����
	ObjectOutputStream out;
	ObjectInputStream oin;
	boolean loop = true; // Ŭ���̾�Ʈ ���� ���ӷ��� ����/���� ����

	public GameClientEx() {
		super("���� Ŭ���̾�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 470, 470);
		getContentPane().setLayout(null);

		gp = new GamePanel(this);
		add(gp);

		connect();// ������ �����Ѵ�

		setVisible(true);
	}

	/** �������ῡ �����ϸ� ����� ������ �����ϰ� �Է� �����带 �����Ѵ� */
	private void connect() {
		try {
			Socket socket = new Socket("localhost", 1234);
			out = new ObjectOutputStream(socket.getOutputStream());
			oin = new ObjectInputStream(socket.getInputStream());
			// �����κ��� ���� �����͸� �����ϴ� ������
			new Thread() {
				@Override
				public void run() {
					Point2D ballPos = null;
					Point2D bulletPos = null;
					// Ŭ���̾�Ʈ ���ӷ���(���������� �ֱ������� ���� �����͸� ������ ������ 1ȸ�� ������ ����ȴ�)
					// ������������ �� 33�и��ʸ��� �����ڿ��� ���� �����͸� ������
					while (loop) {

						try {
							// ���������� ���۵� ���� �����͸� ������
							gd = (GameData) oin.readObject();

							// �߻���� ��ġ ��ǥ�� ���� �г��� �߾� �ϴ����� �ʱ�ȭ�Ѵ�
							if (gd.gunPos.getX() == -100 && gd.gunPos.getY() == -100) {
								synchronized (gp) {
									gd.gunPos.setLocation(gp.x, gp.y);
								}
							}
							// ȭ���� �׸���
							gp.repaint();

							if (gd.winner != null)
								break;
							// ȭ���� �׸� ���� ó��
							// ��ź�� ȭ�� ��� ������ ������ ���
							if (gd.bulletPos.getY() < 0) {
								synchronized (gp) {
									gd.fired = false;
								}
								gp.sendGameData();
							}
							// �̿��ڰ� �߻��� ��ź�� ���� �浹�˻�
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
	int x, y; // gun �� �ʱ���ġ

	GamePanel(GameClientEx f) {
		this.f = f;
		// ���ӿ� ���� ��� ������ BufferedImage�� �׸���
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
						myBulletPos.setLocation(gunPos.getX(), gunPos.getY() - 10);// ��ź �߻� ��ġ ����
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

		// �� �׸�
		g2d.drawImage(ball, (int) f.gd.ballPos.getX(), (int) f.gd.ballPos.getY(), null);

		// �߻�� �ʱ�ȭ
		if (f.gd.gunPos.getX() == -100 && f.gd.gunPos.getY() == -100) {
			synchronized (this) {
				f.gd.gunPos.setLocation(x, y);
			}
		}

		// �߻�� �׸�
		g2d.drawImage(gun, (int) f.gd.gunPos.getX(), (int) f.gd.gunPos.getY(), null);

		// ���� ��ź �׸�
		if (f.gd.fired) {
			Point2D bulletPos = f.gd.bulletPos;
			g2d.drawImage(bulletRed, (int) bulletPos.getX(), (int) bulletPos.getY(), null);
		}

		// �ٸ� �÷��̾��� ��ź�� �׸���
		for (int i = 0; i < f.gd.bulletList.size(); i++) {
			Point2D otherBulletPos = f.gd.bulletList.get(i);
			// ����Ʈ�� ���Ե� ������ ���� ��ź�� ��ġ�� ��쿡�� �׸��� �ʴ´�(������ �׷ȱ� ������)
			if (f.gd.bulletPos.equals(otherBulletPos))
				continue;
			g2d.drawImage(bulletWhite, (int) otherBulletPos.getX(), (int) otherBulletPos.getY(), null);
		}

		// ���� ��ź�� ���� ������ Ƚ��(���� ����) ���
		g2d.drawString("HIT:" + f.gd.hitCnt, 5, 25);

		// �ٸ� �̿����� ��Ʈ�� ���
		synchronized (this) {
			f.gd.pointMap.remove(f.gd.id); // ���� ��Ʈ ���� �ʿ��� �����Ѵ�(������ ��������Ƿ�)
		}
		String[] id = f.gd.pointMap.keySet().toArray(new String[f.gd.pointMap.size()]);
		for (int i = 0; i < id.length; i++) {
			// �ٸ� �̿����� ������ ����ϴ� ��ġ�� ���� ������ ������� �ʴ´�
			g2d.drawString(id[i] + " HIT:" + f.gd.pointMap.get(id[i]), 300, 15 * (i + 1));
		}

		// ��Ʈ �� 10���� ���� ���� ������ ��� ����Ѵ�
		if (f.gd.win || f.gd.winner != null) { // �������� ����� ���
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
					f.out.reset(); // ����ȭ ���߿� ȣ��Ǹ� �����߻�
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