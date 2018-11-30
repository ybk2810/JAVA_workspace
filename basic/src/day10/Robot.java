package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Robot extends Frame implements KeyListener, WindowListener {
	Button[] btnlist = new Button[6];

	Robot() {
		setTitle("Log");
		setBounds(0, 0, 1000, 800);
		setLayout(null);// 배치관리자 x
		btnlist[0] = new Button("^ . ^");
		btnlist[1] = new Button("Body");
		btnlist[2] = new Button("Left");
		btnlist[3] = new Button("Right");
		btnlist[4] = new Button("Leg");
		btnlist[5] = new Button("Leg2");

		btnlist[0].setBounds(200, 610, 50, 40);
		btnlist[1].setBounds(200, 650, 50, 50);
		btnlist[2].setBounds(250, 650, 50, 20);
		btnlist[3].setBounds(180, 650, 20, 50);
		btnlist[4].setBounds(225, 700, 25, 100);
		btnlist[5].setBounds(200, 700, 25, 100);

		Color c = new Color(247, 122, 40);

		for (int i = 0; i < btnlist.length; i++) {
			btnlist[i].setBackground(c);
			btnlist[i].addKeyListener(this);
			add(btnlist[i]);
		}
		// for (int i = 0; i < btnlist.length; i++) {
		// btnlist[i] = new Button("");
		//// btnlist[i].addKeyListener(this);
		//// add(btnlist[i]);
		// }

		setVisible(true);

		// 이벤트처리
		addWindowListener(this);

	}

	public static void main(String[] args) {
		new Robot();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		System.out.println(key);
		for (int i = 0; i < btnlist.length; i++) {
			int bx = btnlist[i].getX();
			int by = btnlist[i].getY();
			if (key == 37) {
				bx -= 10;
			} else if (key == 38) {
				by -= 10;
			} else if (key == 39) {
				bx += 10;
			} else if (key == 40) {
				by += 10;
			}
			btnlist[i].setLocation(bx, by);
		}

		if (key == 32) {
			System.out.println("JUMP");
			for (int j = 0; j <= 20; j++) {

				for (int i = 0; i < btnlist.length; i++) {
					int bx = btnlist[i].getX();
					int by = btnlist[i].getY();
					by -= 10;
					btnlist[i].setLocation(bx, by);
				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for (int j = 0; j <= 20; j++) {
				for (int i = 0; i < btnlist.length; i++) {
					int bx = btnlist[i].getX();
					int by = btnlist[i].getY();
					by += 10;
					btnlist[i].setLocation(bx, by);
				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		} else if (key == 65) {
			System.out.println("ATACK");
			int bx = btnlist[2].getX();
			int by = btnlist[2].getY();
			for (int j = 0; j <= 20; j++) {
				bx += 10;
				btnlist[2].setLocation(bx, by);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for (int j = 0; j <= 20; j++) {
				bx -= 10;
				btnlist[2].setLocation(bx, by);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		} else if (key == 83) {
			System.out.println("JUMP");
			for (int j = 0; j <= 20; j++) {
				for (int i = 0; i < btnlist.length; i++) {
					int px = btnlist[i].getX();
					int py = btnlist[i].getY();
					double c = -1 / 16 * (px * px - 3) + 5;

					btnlist[i].setLocation(px + 3, py - (int) c);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			for (int j = 0; j <= 20; j++) {
				for (int i = 0; i < btnlist.length; i++) {
					int px = btnlist[i].getX();
					int py = btnlist[i].getY();
					double c = 1 / 16 * (px * px + 3) - 5;
					btnlist[i].setLocation(px + 3, py - (int) c);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
