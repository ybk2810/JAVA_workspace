package day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WinEx4 extends Frame implements ActionListener {
	int x;
	Button btn;
	Random rnd = new Random();
	
	WinEx4(){
		x = 100;
		btn = new Button("시작");
		setLayout(null);
		btn.setBounds(400, 500, 100, 30);
		btn.addActionListener(this);
		
		add(btn);
		
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
		g.drawOval(x, 100, 200, 200);
		
	}
	
	public static void main(String[] args) {
		new WinEx4();
	}

	@Override
	public void update(Graphics g) {
		// 현재 창을 지우고 paint 메세드를 호출
		//super.update(g);
		paint(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x+=1;
		repaint();
		
		
		
	}
}
