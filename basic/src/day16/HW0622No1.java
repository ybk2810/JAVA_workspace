package day16;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HW0622No1 extends Frame {

	HW0622No1() {

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBounds(100, 100, 600, 600);
		setVisible(true);

	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Color c = new Color(0,0,0);
		Color c1 = new Color(255,0,0);
		Color c2 = new Color(0,0,255);
		
		g.drawOval(200,200,200,200);
		
		g.drawOval(260,260,20,20);
		g.drawOval(320,260,20,20);
		
		g.drawOval(270,270,1,1);
		g.drawOval(330,270,1,1);
		
		g.drawRect(260, 300, 20, 20);
		g.drawRect(280, 300, 20, 20);
		g.setColor(c1);
		g.fillRect(300, 300, 20, 20);
		g.setColor(c);
		g.drawRect(320, 300, 20, 20);
		g.setColor(c2);
		g.fillRect(260, 320, 20, 20);
		g.setColor(c);
		g.drawRect(280, 320, 20, 20);
		g.drawRect(300, 320, 20, 20);
		g.drawRect(320, 320, 20, 20);
		
		g.drawArc(185, 275, 30, 50, 90, 180);
		g.drawArc(385, 275, 30, 50, 90, -180);
		
	}
	public static void main(String[] args) {
		new HW0622No1();
	}
}
