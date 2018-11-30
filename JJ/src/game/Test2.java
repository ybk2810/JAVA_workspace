package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import day16.TCanvas;

public class Test2 extends JFrame implements KeyListener {
	JPanel jp1;
	int x1, y1, x2, y2, xb, yb;
	JButton jbtn1, jbtn2, jbtnb;
	ImageIcon img1, img2;
	
	Test2(){
		x1 = 100;
		y1= 400;
		x2 = 400;
		y2 = 400;
		xb = 1000;
		yb = 1000;
		
		jp1 = new JPanel();
		
		img1 = new ImageIcon("src/gameImg/btnimg2.jpg");
		img2 = new ImageIcon("src/gameImg/btnimg2.jpg");
		
		jbtnb = new JButton("");
		jbtn1 = new JButton("");
		jbtn2 = new JButton("");
		
		jbtn1.setIcon(img1);
		jbtn2.setIcon(img2);
		
		jp1.setLayout(null);
		
		jbtn1.setBounds(x1, y1, 150, 150);
		jbtn2.setBounds(x2, y2, 150, 150);
		jbtnb.setBounds(xb, yb, 50, 50);
		
		jbtn1.addKeyListener(this);
		jbtn2.addKeyListener(this);
		jbtnb.addKeyListener(this);
		
		add(jp1);
		jp1.add(jbtnb);
		jp1.add(jbtn1);
		jp1.add(jbtn2);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 50, 800, 800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test2();
	}
	
	public boolean Crash(int x1, int y1, int x2, int y2, JButton jbtn1, JButton jbtn2){
		//기존 충돌 판정 소스를 변경합니다.
		//이제 이미지 변수를 바로 받아 해당 이미지의 넓이, 높이값을
		//바로 계산합니다.

		boolean check = false;

		if ( Math.abs( ( x1 + jbtn1.getWidth() / 2 ) - ( x2 + jbtn2.getWidth() / 2 ))
				< ( jbtn2.getWidth() / 2 + jbtn1.getWidth() / 2 ) && Math.abs( ( y1 + jbtn1.getHeight() / 2 )
						- ( y2 + jbtn2.getHeight() / 2 )) < ( jbtn2.getHeight()/2 + jbtn1.getHeight()/2 ) ){
			check = true;//위 값이 true면 check에 true를 전달합니다.
			
		}else{ check = false;}
		return check; //check의 값을 메소드에 리턴 시킵니다.
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		//System.out.println(key);
		if(key == 37) {
			x1 -= 10;
			jbtn1.setLocation(x1, y1);
			
		}else if(key == 39) {
			x1 += 10;
			jbtn1.setLocation(x1, y1);
			
		}else if(key == 32) {
			jbtnb.setLocation(jbtn1.getX()-jbtnb.getWidth()/2, jbtn1.getY()-jbtnb.getHeight());
			
			for(int i=0; i<=20; i++) {
				jbtnb.setLocation(jbtnb.getX()+3, jbtnb.getY()-3);
				try {
					Thread.sleep(25);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for(int i=0; i<=20; i++) {
				jbtnb.setLocation(jbtnb.getX()+3, jbtnb.getY()+3);
				try {
					Thread.sleep(25);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		if(Crash(x1, y1, x2, y2, jbtn1, jbtn2)) {
			System.out.println("꽝");
		}  
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
