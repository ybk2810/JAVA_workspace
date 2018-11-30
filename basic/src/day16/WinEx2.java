package day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WinEx2 extends Frame {

	Button btn;
	Random rnd = new Random();
	
	WinEx2(){
		
		btn = new Button("����");
		setLayout(null);
		btn.setBounds(400, 500, 100, 30);
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
		// ���� ��ġ�� ������ ������� �� �׸��� 20��
		for(int i = 0; i<2000; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(new Color(rnd.nextInt(250),rnd.nextInt(250),rnd.nextInt(250)));
		g.drawOval(rnd.nextInt(800), rnd.nextInt(600), rnd.nextInt(300), rnd.nextInt(300));
		}
	}
	
	public static void main(String[] args) {
		new WinEx2();
	}
}
