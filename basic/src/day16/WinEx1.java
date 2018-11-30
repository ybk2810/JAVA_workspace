package day16;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx1 extends Frame {

	WinEx1() {

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBounds(100, 100, 800, 600);
		setVisible(true);

	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// g: 붓
		// 직선 그리기
		g.drawLine(100, 100, 200, 200);
		
		// 사각형 그리기
		g.drawRect(100, 100, 200, 200);
		
		// 타원 그리기
		// x1, y1 기준으로 너비 200 높이 200
		// 원 90각도에서 반기계반향으로 90도 만큼
		g.drawArc(400, 400, 200, 200, 90, 90);
		
		// 원그리기
		g.drawOval(100,100,200,200);
		
		// 사각형 채우기
		g.fillRect(300, 300, 50, 50);
		
		// 색상지정
		// RGB
		Color c = new Color(255,0,0);
		g.setColor(c);
		g.fillRect(500, 300, 50, 50);
		
		// 글쓰기
		g.drawString("시험없는금요일", 200, 50);
		
		
		
	}
	

	public static void main(String[] args) {

		new WinEx1();

	}

}