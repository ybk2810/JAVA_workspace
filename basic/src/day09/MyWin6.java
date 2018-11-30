package day09;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin6 extends Frame {
	Button btnRed, btnBlue;
	MyWin6(){
		// ��ġ������ �����ϴ� �޼���
		setLayout(null);
		
		// ��ư �ʱ�ȭ
		btnRed = new Button("OK");
		btnBlue = new Button("EXIT");
		
		// ������Ʈ�� ũ��� ��ġ�� ��������
		btnRed.setSize(200,100);
		btnRed.setLocation(150, 400);
		btnBlue.setBounds(400,400,200,100);
		
		//��ư�� ��ĥ�ϱ�
		btnRed.setBackground(Color.RED);
		btnBlue.setBackground(Color.BLUE);
		
		// �̺�Ʈó��
		// 1. �̺�Ʈ�ҽ� ����: btnBlue
		// 2. ������ ����
		Handler2 h = new Handler2();
		btnRed.addActionListener(h);
		btnBlue.addActionListener(h);
		
		
		// ��ư ����
		add(btnRed);
		add(btnBlue);
		
		setBounds(100,100,800,600);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin6();
	}
}// class end

//1���� ���Ͽ� 1���� Ŭ������ ���� ���� ��Ģ
//Ŭ������� ������ �̸��� ���� Test <==>Test.java

//public class�� �ȵ�
class Handler2 implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("�Ķ���ư Ŭ��");
		String cmd = e.getActionCommand();
		System.out.println(cmd);
		if(cmd == "OK") {
			System.out.println("������ư ����");
		}else if(cmd == "EXIT") {
			System.out.println("�Ķ���ư ����");
		}
	}
}











