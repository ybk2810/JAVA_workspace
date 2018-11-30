package ProjectGG;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Par3Game extends JPanel implements Runnable {
	int user;
	int angle = 5;
	int angle_vel = 1;
	int power = 0;
	int power_vel = 1;
	int step = 0;// 상태
	int cnt = 0;
	int user_i = 0;
	int play_j = 0;

	double xd = 0.01;
	double yd = 0.5;
	double[] ballx;
	double[] bally;
	double ballvelx;
	double ballvely;
	double gravity = 0.03d;// 중력
	double x, y, bottomy, hollx; // 티샷위치

	boolean bln = true;
	boolean bln2 = false;

	int[][] score_list;
	boolean[][] user_boolean;

	Image icPar3, icFlag, icStart, icEnd, ball1, icCart, icBird;
	Image igmAlbatross, igmHoleInOne, igmEagle, igmBirdie, igmPar, igmOB;
	Image igmBogey, igmDoubleBogey, igmTripleBogey, igmQaudrupleBogey, igmDoublePar;

	JProgressBar jb;
	JLabel lb, lb1, lb2, lb3, lb4;
	JLabel[] lb_score;

	public Par3Game() {

	}

	public Par3Game(int user) {
		this.user = user;
		icPar3 = Toolkit.getDefaultToolkit().getImage("src/images/Par3Hole.png");
		icFlag = Toolkit.getDefaultToolkit().getImage("src/images/TestFlag.png");
		icStart = Toolkit.getDefaultToolkit().getImage("src/images/Start.gif");
		icEnd = Toolkit.getDefaultToolkit().getImage("src/images/End.gif");
		icCart = Toolkit.getDefaultToolkit().getImage("src/images/Par3CartMove.gif");
		icBird = Toolkit.getDefaultToolkit().getImage("src/images/Par3BirdMove.gif");
		igmAlbatross = Toolkit.getDefaultToolkit().getImage("src/images/Albatross.gif");
		igmHoleInOne = Toolkit.getDefaultToolkit().getImage("src/images/HoleInOne.gif");
		igmEagle = Toolkit.getDefaultToolkit().getImage("src/images/Eagle.gif");
		igmBirdie = Toolkit.getDefaultToolkit().getImage("src/images/Birdie.gif");
		igmPar = Toolkit.getDefaultToolkit().getImage("src/images/Par.gif");
		igmOB = Toolkit.getDefaultToolkit().getImage("src/images/OB.gif");
		igmBogey = Toolkit.getDefaultToolkit().getImage("src/images/Bogey.gif");
		igmDoubleBogey = Toolkit.getDefaultToolkit().getImage("src/images/DoubleBogey.gif");
		igmTripleBogey = Toolkit.getDefaultToolkit().getImage("src/images/TripleBogey.gif");
		igmQaudrupleBogey = Toolkit.getDefaultToolkit().getImage("src/images/QaudrupleBogey.gif");
		igmDoublePar = Toolkit.getDefaultToolkit().getImage("src/images/DoublePar.gif");
		ball1 = Toolkit.getDefaultToolkit().getImage("src/images/ball.png");

		hollx = 1055;
		bottomy = 740;
		ballx = new double[user];
		bally = new double[user];
		for (int i = 0; i < ballx.length; i++) {
			ballx[i] = 50;
			bally[i] = bottomy;// 공의 초기위치
		}
		bln = true;

		score_list = new int[5][user];
		user_boolean = new boolean[4][user];
		for (int j = 0; j < score_list.length; j++) {
			for (int i = 0; i < score_list[j].length; i++) {
				score_list[j][i] = 0;
			}
		}

		for (int j = 0; j < user_boolean.length; j++) {
			for (int i = 0; i < user_boolean[j].length; i++) {
				user_boolean[j][i] = false;
			}
		}

		P_Bar();

		lb = new JLabel("");
		lb1 = new JLabel("");
		lb2 = new JLabel("");
		lb3 = new JLabel("");
		lb4 = new JLabel("");
		// lb_score = new JLabel[score_list[0].length];

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				step++;// 키를 누룰때 마다 상태가 바뀜

				if (step == 2) {// 상태가 2일 경우
					add(jb);// 프로그레스 바 화면에 넣기
				} else if (step == 4) {// 각도와 힘으로 공 움직이기
					ballvelx = (power * Math.cos(angle * (Math.PI / 180))) * 0.05;
					ballvely = -(power * Math.sin(angle * (Math.PI / 180))) * 0.05;
				} else if (step == 7) {// 4가 되면 처음 부터
					cnt++;
					step = 1;
					remove(jb);// 초기화 될경우 프로그레스바 화면에서 지우기
				}
			}
		});

		Thread t = new Thread(this);// 게임 루프
		t.start();
	}

	public void Process() {
		Score();
		switch (step) {
		case 2:// 스탭1 이면 각도 선택
			angle += angle_vel;
			if (angle > 80 || angle < 5) {
				angle_vel *= -1;
			}
			bally[user_i] = bottomy;// 공의 초기위치
			break;
		case 3:// 스탭2 이면 파워 선택
			power += power_vel;
			if (power > 99 || power < 1) {
				power_vel *= -1;
			}
			jb.setValue(power);// 파워값을 프로그래스바로 표현

			if (ballx[user_i] < hollx) {
				bln = true;
			} else if (ballx[user_i] > hollx) {
				bln = false;
			}

			break;
		case 4:// 스탭3 이면 각도와 힘으로 공 포불선 움직임
			if (bln == true) {
				ballx[user_i] += ballvelx;
				bally[user_i] += ballvely;
				ballvely += gravity;// 중력 값을 더해줌

				if (bally[user_i] > bottomy && ballvely > 0) {
					ballvely = -(ballvely * 0.9) / 1.5;
					ballvelx = (ballvelx * 0.7);
				}
			} else if (bln == false) {
				ballx[user_i] -= ballvelx;
				bally[user_i] += ballvely;
				ballvely += gravity;// 중력 값을 더해줌

				if (bally[user_i] > bottomy && ballvely > 0) {
					ballvely = -(ballvely * 0.9) / 1.5;
					ballvelx = (ballvelx * 0.7);
				}
			}
			// System.out.println("cnt = " + cnt);
			break;
		case 6:
			this.ballx[user_i] = ballx[user_i];
			this.bally[user_i] = bally[user_i];
			if (hollx - 20 < ballx[user_i] && ballx[user_i] < hollx + 20) {
				// && bottomy - 10 < bally[user_i] && bally[user_i] < bottomy + 10
				if (bln2 == true) {
					bln2 = false;
					cnt = 0;
				}
				user_boolean[play_j][user_i] = true;

				this.user_i = user_i + 1;
				if (this.user_i == user) {
					if (this.play_j == 2) {
						System.out.println("GAME END");
						step=8;
					}
					this.user_i = 0;
					this.play_j += 1;
				}
				ballx[user_i] = 50;
				bally[user_i] = bottomy;// 공의 초기위치
			}
			break;
		}
	}

	public void P_Bar() {
		jb = new JProgressBar();// 프로그레스바 생성
		jb.setBounds(650 - 100, 200, 200, 50);
		jb.setValue(0);
		jb.setMinimum(0);
		jb.setMaximum(100);
		jb.setStringPainted(true);
		jb.setBackground(Color.YELLOW);
		jb.setForeground(Color.RED);
	}

	public void Score() {
		lb.setText("             Game1      Game2      Game3      Total");
		lb.setBounds(765, 432 - 25, 440, 50);
		lb.setOpaque(false);
		lb.setFont(new Font("Dialog", Font.ITALIC, 20));
		lb.setForeground(Color.BLACK);
		add(lb);

		for (int i = 0; i < score_list[0].length; i++) {
			score_list[3][i] = score_list[0][i] + score_list[1][i] + score_list[2][i];
		}

		lb1.setText("Player" + 1 + "       " + score_list[0][0] + "               " + score_list[1][0]
				+ "               " + score_list[2][0] + "             " + score_list[3][0]);
		lb1.setBounds(765, 432 - 25 + 30, 440, 50);
		lb1.setOpaque(false);
		lb1.setFont(new Font("Dialog", Font.ITALIC, 20));
		lb1.setForeground(Color.BLACK);
		add(lb1);

		if (user == 2) {
			lb2.setText("Player" + 2 + "       " + score_list[0][1] + "               " + score_list[1][1]
					+ "               " + score_list[2][1] + "             " + score_list[3][1]);
			lb2.setBounds(765, 432 - 25 + 60, 440, 50);
			lb2.setOpaque(false);
			lb2.setFont(new Font("Dialog", Font.ITALIC, 20));
			lb2.setForeground(Color.BLACK);
			add(lb2);
		} else if (user == 3) {
			lb2.setText("Player" + 2 + "       " + score_list[0][1] + "               " + score_list[1][1]
					+ "               " + score_list[2][1] + "             " + score_list[3][1]);
			lb2.setBounds(765, 432 - 25 + 60, 440, 50);
			lb2.setOpaque(false);
			lb2.setFont(new Font("Dialog", Font.ITALIC, 20));
			lb2.setForeground(Color.BLACK);
			add(lb2);
			lb3.setText("Player" + 3 + "       " + score_list[0][2] + "               " + score_list[1][2]
					+ "               " + score_list[2][2] + "             " + score_list[3][2]);
			lb3.setBounds(765, 432 - 25 + 90, 440, 50);
			lb3.setOpaque(false);
			lb3.setFont(new Font("Dialog", Font.ITALIC, 20));
			lb3.setForeground(Color.BLACK);
			add(lb3);
		} else if (user == 4) {
			lb2.setText("Player" + 2 + "       " + score_list[0][1] + "               " + score_list[1][1]
					+ "               " + score_list[2][1] + "             " + score_list[3][1]);
			lb2.setBounds(765, 432 - 25 + 60, 440, 50);
			lb2.setOpaque(false);
			lb2.setFont(new Font("Dialog", Font.ITALIC, 20));
			lb2.setForeground(Color.BLACK);
			add(lb2);
			lb3.setText("Player" + 3 + "       " + score_list[0][2] + "               " + score_list[1][2]
					+ "               " + score_list[2][2] + "             " + score_list[3][2]);
			lb3.setBounds(765, 432 - 25 + 90, 440, 50);
			lb3.setOpaque(false);
			lb3.setFont(new Font("Dialog", Font.ITALIC, 20));
			lb3.setForeground(Color.BLACK);
			add(lb3);
			lb4.setText("Player" + 4 + "       " + score_list[0][3] + "               " + score_list[1][3]
					+ "               " + score_list[2][3] + "             " + score_list[3][3]);
			lb4.setBounds(765, 432 - 25 + 120, 440, 50);
			lb4.setOpaque(false);
			lb4.setFont(new Font("Dialog", Font.ITALIC, 20));
			lb4.setForeground(Color.BLACK);
			add(lb4);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(icPar3, 0, 0, getWidth(), getHeight(), null);
		g.drawImage(icFlag, 1000, 660, 70, 95, this);
		g.drawImage(icCart, 0, 700, 1600, 62, this);
		g.drawImage(icBird, 0, 50, 1600, 62, this);
		switch (step) {
		case 0:
			g.drawImage(icStart, getWidth() / 2 - 226, getHeight() / 2 - 71, 452, 142, this);
		case 1:
			g.setColor(Color.white);
			g.drawImage(ball1, (int) ballx[user_i] - 5, (int) bally[user_i] - 5, 20, 20, this);
			g.setColor(Color.red);
			g.fillArc(30, 600, 100, 100, 0, angle);
			break;
		case 2:
			g.setColor(Color.white);
			g.drawImage(ball1, (int) ballx[user_i] - 5, (int) bally[user_i] - 5, 20, 20, this);
			g.setColor(Color.red);
			g.fillArc(30, 600, 100, 100, 0, angle);
			// System.out.println("> " + angle);
			break;
		case 3:
			g.setColor(Color.white);
			g.drawImage(ball1, (int) ballx[user_i] - 5, (int) bally[user_i] - 5, 20, 20, this);
			g.setColor(Color.red);
			g.fillArc(30, 600, 100, 100, 0, angle);
			break;
		case 4:
			g.setColor(Color.white);
			g.drawImage(ball1, (int) ballx[user_i] - 5, (int) bally[user_i] - 5, 20, 20, this);
			g.setColor(Color.red);
			g.fillArc(30, 600, 100, 100, 0, angle);
			break;

		case 5:
			g.setColor(Color.white);
			g.drawImage(ball1, (int) ballx[user_i] - 5, (int) bally[user_i] - 5, 20, 20, this);
			g.setColor(Color.red);
			g.fillArc(30, 600, 100, 100, 0, angle);
			if (hollx - 20 < ballx[user_i] && ballx[user_i] < hollx + 20) {
				// && bottomy - 10 < bally[user_i] && bally[user_i] < bottomy + 10
				if (cnt == 1) {
					g.drawImage(igmHoleInOne, getWidth() / 2 - 380, getHeight() / 2 - 41, 760, 82, this);
					score_list[play_j][user_i] = -2;
					System.out.println("player" + user_i + " is " + "HoleInOne!!");
				} else if (cnt == 2) {
					g.drawImage(igmBirdie, getWidth() / 2 - 195, getHeight() / 2 - 41, 390, 82, this);
					score_list[play_j][user_i] = -1;
					System.out.println("player" + user_i + " is " + "Birdie!!");
				} else if (cnt == 3) {
					g.drawImage(igmPar, getWidth() / 2 - 120, getHeight() / 2 - 46, 240, 92, this);
					score_list[play_j][user_i] = 0;
					System.out.println("player" + user_i + " is " + "Par!!");
				} else if (cnt == 4) {
					g.drawImage(igmBogey, getWidth() / 2 - 185, getHeight() / 2 - 53, 370, 106, this);
					score_list[play_j][user_i] = 1;
					System.out.println("player" + user_i + " is " + "Bogey!!");
				} else if (cnt == 5) {
					g.drawImage(igmDoubleBogey, getWidth() / 2 - 210, getHeight() / 2 - 110, 420, 220, this);
					score_list[play_j][user_i] = 2;
					System.out.println("player" + user_i + " is " + "DoubleBogey!!");
				} else if (cnt >= 6) {
					g.drawImage(igmDoublePar, getWidth() / 2 - 210, getHeight() / 2 - 110, 420, 220, this);
					score_list[play_j][user_i] = 3;
					System.out.println("player" + user_i + " is " + "DoublePar!!");
				}
				bln2 = true;
			}
			break;
		case 6:
			g.setColor(Color.white);
			g.drawImage(ball1, (int) ballx[user_i] - 5, (int) bally[user_i] - 5, 20, 20, this);
			g.setColor(Color.red);
			g.fillArc(30, 600, 100, 100, 0, angle);
			break;
		case 7:
			g.setColor(Color.white);
			g.drawImage(ball1, (int) ballx[user_i] - 5, (int) bally[user_i] - 5, 20, 20, this);
			g.setColor(Color.red);
			g.fillArc(30, 600, 100, 100, 0, angle);
			break;
		case 8:
			g.drawImage(icEnd, getWidth() / 2 - 226, getHeight() / 2 - 71, 452, 142, this);
			break;
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Process();
				repaint();
				Thread.sleep(15);
			} catch (InterruptedException e1) {
				System.exit(0);
			}
		}
	}
}