package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import day20.MemberDAO;

public class Login extends Frame implements ActionListener, WindowListener {
	Button btnLogin, btnExit;
	TextField tfID, tfPW;
	Label lbID, lbPW;

	Login() {
		setTitle("Log");
		setBounds(100, 100, 500, 600);
		setLayout(null);// 배치관리자 x

		btnLogin = new Button("로그인");
		btnExit = new Button("Exit");
		tfID = new TextField(20);
		tfPW = new TextField(20);
		tfPW.setEchoChar('*'); // 비밀번호 입력시 *로 채우기
		lbID = new Label("ID");
		lbPW = new Label("PW");

		btnLogin.addActionListener(this);
		btnExit.addActionListener(this);

		btnLogin.setBounds(100, 500, 100, 60);
		btnExit.setBounds(300, 500, 100, 60);
		tfID.setBounds(200, 100, 200, 60);
		tfPW.setBounds(200, 200, 200, 60);
		lbID.setBounds(100, 100, 100, 60);
		lbPW.setBounds(100, 200, 100, 60);

		Color c = new Color(247, 122, 40);
		btnLogin.setBackground(c);

		add(btnLogin);
		add(btnExit);
		add(tfID);
		add(tfPW);
		add(lbID);
		add(lbPW);

		setVisible(true);

		// 이벤트처리
		addWindowListener(this);
		btnExit.addActionListener(this);
	}

	public static void main(String[] args) {
		new Login();
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
		Object obj = e.getSource();

		System.out.println(obj);
		if (obj == btnExit) {
			System.exit(0);
		} else if (obj == btnLogin) {
			String id = tfID.getText();
			String pw = tfPW.getText();
			System.out.println("ID: " + id);
			System.out.println("PW: " + pw);

			// db에 가서
			MemberDAO dao = new MemberDAO();
			if (dao.isLogIn(id, pw)) {
				System.out.println("로그인 성공");
				new Cal();
				this.setVisible(false);
			} else {
				tfID.setText("");
				tfPW.setText("");
				JOptionPane.showConfirmDialog(this, "아이디또는 비번을 틀렸어요");
			}
		}
	}

}
