package day09;
// ��ư�� �� ������ ũ��� ��ġ

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyWin4 extends Frame {
Button btnEast;
Button btnWest;
Button btnNorth;
Button btnSouth;
Button btnCenter;
	
MyWin4(){
		setTitle("��ư�����");
		
		//x,y,�ʺ�,����
		setBounds(300,300,300,300);
//		setSize(300, 300);
//		setLocation(300, 300);
		
		//FlowLayout
		FlowLayout f1 = new FlowLayout();
		
		//��ġ������ ����
		setLayout(f1);
		
		
		// ��ġ������ (Lyout Manager)
		// Frame�� �⺻ ��ġ������
		// BorderLayout
		
		// ������Ʈ �ʱ�ȭ
		btnEast = new Button("East");
		btnWest = new Button("West");
		btnNorth = new Button("North");
		btnSouth = new Button("South");
		btnCenter = new Button("Center");
		
//		Handler h = new Handler();
//		btn1.addActionListener(h);
//		btn2.addActionListener(h);
		
		add(btnEast,"East");
		add(btnWest,"West");
		add(btnNorth,"North");
		add(btnSouth,"South");
		add(btnCenter,"Center");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin4 mw = new MyWin4();
	}
}
