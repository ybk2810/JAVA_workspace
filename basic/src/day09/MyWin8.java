package day09;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin8 extends Frame implements ActionListener {
	Button btnYes, btnNo;
	Label lb;
	MyWin8(){
		setLayout(null);
		lb = new Label("�����ϴ� ������?");
		btnYes = new Button("����");
		btnNo = new Button("�Ķ�");
		
		btnYes.setBounds(200, 400, 100, 50);
		btnNo.setBounds(400, 400, 100, 50);
		lb.setBounds(50, 50, 250, 50);
		
		//ActionListener�������̽��� ������ ��ü
		btnYes.addActionListener(this);
		btnNo.addActionListener(this);
				
		add(btnYes);
		add(btnNo);
		add(lb);

		setBounds(100,100,800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin8();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//String cmd = e.getActionCommand();
		Object obj = e.getSource();
		
		System.out.println(obj);
		if(obj == btnYes) {
			System.out.println("��������..");
		}else if(obj == btnNo) {
			System.out.println("�����ְ� ����");
		}
	}
}
