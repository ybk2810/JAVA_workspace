package day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx3 extends Frame {
	
	
	WinEx3(){
		setLayout(null);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(100,100,800,600);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 랜덤 위치에 랜덤한 사이즈로 원 그리기 20번
		for(int i = 0; i<2000; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawOval(100+i*5, 100+i*5, 100, 100);
		}
	}
	
	public static void main(String[] args) {
		new WinEx3();
	}
	
	
}
