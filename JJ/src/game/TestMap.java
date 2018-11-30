package game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TestMap extends MainFrame implements KeyListener {
	JButton tank1, tank2, p;
	ImageIcon btnimg1, btnimg2, btnimg3, btnimg4;
	ImageIcon btnimg5, btnimg6, btnimg7, btnimg8;
	Random rnd = new Random();
	int a = 2;
	int b = 0;
	Tank a1, b1;
	
	TestMap(Tank a, Tank b) {
		
		this.a1 = a;
		this.b1 = b;
		
		tank1 = new JButton();
		tank2 = new JButton();
		p = new JButton();
		btnimg1 = new ImageIcon("src/gameImg/kang1.png");
		btnimg2 = new ImageIcon("src/gameImg/jo1.png");
		btnimg3 = new ImageIcon("src/gameImg/hong1.png");
		btnimg4 = new ImageIcon("src/gameImg/mo1.png");
		btnimg5 = new ImageIcon("src/gameImg/kang2.png");
		btnimg6 = new ImageIcon("src/gameImg/jo2.png");
		btnimg7 = new ImageIcon("src/gameImg/hong2.png");
		btnimg8 = new ImageIcon("src/gameImg/mo2.png");
		setLayout(null);
		setBounds(80, 50, 1400, 800);

		p.setFocusable(true);
		if (a.sum == 0) {
			tank1.setIcon(btnimg1);
		} else if (a.sum == 1) {
			tank1.setIcon(btnimg2);
		} else if (a.sum == 2) {
			tank1.setIcon(btnimg3);
		} else if (a.sum == 3) {
			tank1.setIcon(btnimg4);
		}

		if (b.sum == 0) {
			tank2.setIcon(btnimg5);
		} else if (b.sum == 1) {
			tank2.setIcon(btnimg6);
		} else if (b.sum == 2) {
			tank2.setIcon(btnimg7);
		} else if (b.sum == 3) {
			tank2.setIcon(btnimg8);
		}

		tank1.setBounds(rnd.nextInt(700), 550, 60, 60);
		tank2.setBounds(rnd.nextInt(700)+700, 550, 60, 60);
		p.setBounds(20, 150, 30, 30);

		tank1.setContentAreaFilled(false);
		tank1.setBorderPainted(false);
		
		tank2.setContentAreaFilled(false);
		tank2.setBorderPainted(false);
		
		setFocusable(true);
		addKeyListener(this);
		add(tank1);
		add(tank2);
		add(p);
		System.out.println(a);
		System.out.println(b);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(b%2==1) {			
			g.drawLine(tank1.getX()+60, tank1.getY(), tank1.getX()+80, tank1.getY()-30);
		}
	}
	
	@Override
	public void update(Graphics g) {
		super.update(g);
		paint(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		repaint();
		if(key == 32) {
			System.out.println(a);
			a++;	
			}
		if(key == 39 && b%2==1) {
			tank1.setLocation(tank1.getX()+3, tank1.getY());
			if(a1.mo==a) {
				 
			}
		}else if(key == 37 && b%2==1) {
			tank1.setLocation(tank1.getX()-3, tank1.getY());				
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == 32) {
			if (b % 2 == 1) {
				p.setLocation(tank1.getX(), tank1.getY() - 30);
				b++;

				Po po = new Po(p,a);
				po.start();
				
			} else if (b % 2 == 0) {
				p.setLocation(tank2.getX(), tank2.getY() - 30);
				b++;
				
				Po po = new Po(p,a);
				po.start();
			}
			a = 2;
		}
		System.out.println("눌린상태");
	}
}