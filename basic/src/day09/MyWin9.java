package day09;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWin9 extends Frame implements WindowListener {
	//�̺�Ʈ �ҽ�: ���� â
	MyWin9(){
		//addXXXXListener()
		//XXXXListener �������̽���
		addWindowListener(this);
		
		setTitle("â�ݱ�");
		setBounds(100,100,800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyWin9();
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("â�� ���� ��");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("â�� ������ ���� ��");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("â�� ���� �Ŀ�");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ȭ �Ǿ����� ȣ��");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����ܿ��� ����â������� ���� �� ȣ��");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ȱ��ȭ �Ǿ��� �� ȣ��");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��Ȱ��ȭ �Ǿ��� �� ȣ��");
	}
}
