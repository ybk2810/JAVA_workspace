package day09;

import java.awt.Button;
import java.awt.Frame;

public class MyWin3 extends Frame {
	Button btn;
	
	MyWin3(){
		setTitle("AWT FRAME");
		setSize(800, 600);
		setLocation(400,300);
		
		// ������� �ʱ�ȭ
		btn = new Button("�� Ŭ���غ�!");
		
		// btn�� Action�� ������ �� �ִ� Listener�� ����
		Handler h = new Handler();
		
		// addActionLintener(ActionListener l)
		// ActionListener �������̽��� ������ ��ü�� �Ű������� ���� addActionLintener()
		btn.addActionListener(h);
		
		//��ư�� ����(Frame�ļ�, Container �ļ�)
		add(btn);
		
		// event ó�� ����
		// 1. �̺�Ʈ �ҽ� ����
		// 2. ������ ����: �������� �̺�Ʈ�� �߻��ϸ� �ڵ����� �ڵ鷯 ȣ��
		// 3. �ڵ鷯 ����
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin3 mw = new MyWin3();
	}
}
