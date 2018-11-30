package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonControl extends Frame implements ActionListener, WindowListener, MouseMotionListener {
	Button btnLogin, btnExit;
	Label lb;
	
	ButtonControl(){
		setTitle("Log");
		setBounds(100,100,500,600);
		setLayout(null);//��ġ������ x

		
		btnLogin = new Button("�α���");
		btnExit = new Button("Exit");
		lb = new Label("����� �� ����ٰ� �����Ͻʴϱ�?");
		
		btnLogin.addActionListener(this);
		btnExit.addActionListener(this);
		
		btnLogin.setBounds(100, 500, 100, 60);
		btnExit.setBounds(300, 500, 100, 60);
		lb.setBounds(100, 100, 200, 60);
		
		Color c = new Color(247,122,40);
		btnLogin.setBackground(c);
		
		add(btnLogin);
		add(btnExit);
		add(lb);

		
		setVisible(true);
		
		// �̺�Ʈó��
		addWindowListener(this);
		addMouseMotionListener(this);
		btnExit.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ButtonControl();
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();
//		
//		System.out.println(obj);
//		if(obj == btnExit) {
//			System.exit(0);
//		}else if(obj == btnLogin) {
//			String id = tfID.getText();
//			String pw = tfPW.getText();
//			System.out.println("ID: " + id);
//			System.out.println("PW: " + pw);
//			if(id.equals("aaa") && pw.equals("bbb")) {
//				System.out.println("�α��� ����");
//				new Cal();
//			}else {
//				tfID.setText("");
//				tfPW.setText("");
//				JOptionPane.showConfirmDialog(this, "���̵�Ǵ� ����� Ʋ�Ⱦ��");
//				
//			}
//		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// ���콺 ���� MouseEvent
		int x = e.getX();
		int y = e.getY();
		System.out.println("x, y: ("+x+", "+y+")");
		
		int bx = btnLogin.getX();
		int by = btnLogin.getY();
		System.out.println("��ư��ǥ: ("+bx+", "+by+")");
		
		
		// ��ư�� ���� ����������� ��ư ���߾���ġ
		bx+=50;
		by+=30;
		
		// �Ÿ����
		double d = Math.sqrt(
				(double)((bx-x)*(bx-x)+(by-y)*(by-y)));
		System.out.println("�Ÿ�: " + d);
		
		if(d<=70) {
			int dx = (int)(Math.random()*700);
			int dy = (int)(Math.random()*600);
			btnLogin.setLocation(dx, dy);
//			btnLogin.setLocation(e.getX()+20,e.getY()+20);
		}
		
	}

}
