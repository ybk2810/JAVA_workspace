package day09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// interface�� �߻�޼���� ���
// 3. �ڵ鷯 Ŭ���� ����
public class Handler implements ActionListener {
	// event�� �߻��� �� �ڵ����� ȣ��
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��������...");
//		System.exit(0);// ��������
		MyWin3 mw = new MyWin3();
	}

}
