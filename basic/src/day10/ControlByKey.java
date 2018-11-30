package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControlByKey extends Frame implements KeyListener, WindowListener {
	Button btn;
	
	ControlByKey(){
		setTitle("ControlByKey");
		setBounds(0,0,1000,800);
		setLayout(null);//배치관리자 x
		btn = new Button("^^");
		
//		btn.addActionListener(this);
		
		btn.setBounds(100, 500, 50, 30);
		
		Color c = new Color(247,122,40);
		btn.setBackground(c);
		
		add(btn);
		
		setVisible(true);
		
		// 이벤트처리
		addWindowListener(this);
		btn.addKeyListener(this);
	}

	public static void main(String[] args) {
		new ControlByKey();
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
		// ASCII 코드
		int key = e.getKeyCode();
		System.out.println(key);
		System.out.println("ㅎㅎㅎ");
		int bx = btn.getX();
		int by = btn.getY();
		if(key ==37) {
			bx-=3;
		}else if(key ==38) {
			by-=3;
		}else if(key ==39) {
			bx+=3;
		}else if(key ==40) {
			by+=3;
		}else if(key ==32) {
			System.out.println("JUMP");
			for(int i=0;i<=20; i++) {
				by-=3;
				btn.setLocation(bx, by);
				try {
					Thread.sleep(20);
				}catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for(int i=0;i<=20; i++) {
				by+=3;
				btn.setLocation(bx, by);
				try {
					Thread.sleep(20);
				}catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		btn.setLocation(bx, by);;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ㅗㅗㅗ");
		 
	}
}
