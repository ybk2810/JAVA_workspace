package day11;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin2 extends Frame implements MouseListener{
	Panel p1, p2;
	int cnt = 0;
	CardLayout cl;
	//p1 red p2 blue
	
	MyWin2(){
		cl = new CardLayout();
		setLayout(cl);
		
		// 컴포넌트 초기화
		p1 = new Panel();
		p2 = new Panel();
		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		
		add("redPanel", p1);
		add("bluePanel", p2);
		cl.show(this, "redPanel");
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setBounds(100,100,800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyWin2();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("클릭클릭");
		
		cnt++;
		System.out.println(cnt);
		if(cnt%2==1) {
			cl.show(this, "bluePanel");
		}else if(cnt%2==0) {
			cl.show(this, "redPanel");
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
