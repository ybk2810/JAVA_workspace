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
		// g: ��
		// ���� �׸���
		g.drawLine(100, 100, 200, 200);
		
		// �簢�� �׸���
		g.drawRect(100, 100, 200, 200);
		
		// Ÿ�� �׸���
		// x1, y1 �������� �ʺ� 200 ���� 200
		// �� 90�������� �ݱ��������� 90�� ��ŭ
		g.drawArc(400, 400, 200, 200, 90, 90);
		
		// ���׸���
		g.drawOval(100,100,200,200);
		
		// �簢�� ä���
		g.fillRect(300, 300, 50, 50);
		
		// ��������
		// RGB
		Color c = new Color(255,0,0);
		g.setColor(c);
		g.fillRect(500, 300, 50, 50);
		
		// �۾���
		g.drawString("������±ݿ���", 200, 50);
		
		
		
	}
	

	public static void main(String[] args) {

		new WinEx1();

	}

}