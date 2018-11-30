package day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WinEx5 extends Frame implements MouseListener {
	int x1, x2;
	int y1, y2;
	
	WinEx5(){
		x1 = 100; 
		y1 = 100;
		x2 = 200; 
		y2 = 200;
		addMouseListener(this);
//		addMouseMotionListener(this);
		
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
		g.drawLine(x1, y1, x2, y2);
		
	}
	
	public static void main(String[] args) {
		new WinEx5();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Graphics g) {
		// 현재 창을 지우고 paint 메세드를 호출
		//super.update(g);
		paint(g);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void mouseDragged(MouseEvent e) {
//		x2 = e.getX();
//		y2 = e.getY();
//		repaint();
//	}
//
//	@Override
//	public void mouseMoved(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

}
