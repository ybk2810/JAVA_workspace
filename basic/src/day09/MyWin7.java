package day09;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin7 extends Frame {
	Button btnYes, btnNo;
	Label lb;
	MyWin7(){
		//��ġ������ x
		setLayout(null);
		
		//������Ʈ �ʱ�ȭ
		btnYes = new Button("YES");
		btnNo = new Button("NO");
		lb = new Label("�񰡿��� ���� ������ �Ծ���� �ִ�.");
		
		//������Ʈ�� ���� ��ġ�� ����
		btnYes.setBounds(100, 400, 100, 50);
		btnNo.setBounds(400, 400, 100, 50);
		lb.setBounds(50, 50, 250, 50);
		
		Handler3 h = new Handler3();
		btnYes.addActionListener(h);
		btnNo.addActionListener(h);
		
		//������Ʈ ����
		add(btnYes);
		add(btnNo);
		add(lb);
		
		//Yes ������ ��������..
		//No ������ �����ְ� ����
		
		setBounds(100,100,800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin7();
	}

}


class Handler3 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		System.out.println(cmd);
		if(cmd.equals("YES")) {
			System.out.println("��������..");
		}else if(cmd.equalsIgnoreCase("NO")) {
			System.out.println("�����ְ� ����");
		}
	}
}