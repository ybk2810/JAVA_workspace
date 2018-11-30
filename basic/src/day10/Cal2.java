package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
//import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Cal2 extends Frame implements ActionListener, WindowListener {

	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	Button btn0, btn00, btnEq, btnDi, btnMu, btnMi, btnPl;
	TextField tf;
	int firstNumber;
	String oper;
	// Label lb;

	Cal2() {
		setTitle("계산기");
		setBounds(700, 0, 400, 500);
		setLayout(null);

		addWindowListener(this);

		tf = new TextField("0");
		Font f = new Font("맑은고딕", Font.BOLD, 25);
		tf.setFont(f);
		tf.setBounds(60, 100, 270, 50);
		tf.setBackground(Color.ORANGE);
		add(tf);

		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");
		btn7 = new Button("7");
		btn8 = new Button("8");
		btn9 = new Button("9");
		btn0 = new Button("0");
		btn00 = new Button("00");
		btnEq = new Button("=");
		btnDi = new Button("/");
		btnMu = new Button("*");
		btnMi = new Button("-");
		btnPl = new Button("+");

		// 모든 버튼에 리스너 부착
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btn00.addActionListener(this);
		btnEq.addActionListener(this);
		btnDi.addActionListener(this);
		btnMu.addActionListener(this);
		btnMi.addActionListener(this);
		btnPl.addActionListener(this);

		btn0.setBounds(60, 400, 60, 60);
		btn00.setBounds(130, 400, 60, 60);
		btnEq.setBounds(200, 400, 60, 60);
		btnDi.setBounds(270, 400, 60, 60);

		btn1.setBounds(60, 320, 60, 60);
		btn2.setBounds(130, 320, 60, 60);
		btn3.setBounds(200, 320, 60, 60);
		btnMu.setBounds(270, 320, 60, 60);

		btn6.setBounds(60, 240, 60, 60);
		btn5.setBounds(130, 240, 60, 60);
		btn4.setBounds(200, 240, 60, 60);
		btnMi.setBounds(270, 240, 60, 60);

		btn7.setBounds(60, 160, 60, 60);
		btn8.setBounds(130, 160, 60, 60);
		btn9.setBounds(200, 160, 60, 60);
		btnPl.setBounds(270, 160, 60, 60);

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn0);
		add(btn00);
		add(btnEq);
		add(btnDi);
		add(btnMu);
		add(btnMi);
		add(btnPl);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Cal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 클릭하면 버튼의 문자를 콘솔에 출력
		String cmd = e.getActionCommand();
		Object obj = e.getSource();
		// 누른 버튼 숫자로 텍스트 빌드의 값을 변경

		// tf에 글자 가져오기
		String data = tf.getText().trim();// 공백제거: trim

		// 숫자로 변경시켜서 firstNumber변수에 담기

		if (obj == btnPl) {
			firstNumber = Integer.parseInt(data);
			oper = "+";
			tf.setText(data + cmd);
		} else if (obj == btnEq) {
			// 계산 실행
			int result = 0;
			int secondNumber = Integer.parseInt(data);
			if (oper.equals("+")) {
				result = firstNumber + secondNumber;
			}
			// 결과를 tf에 set
//			tf.setText(""+);
		} else {
			tf.setText("");
		}

		// // 숫자로 변환
		// int num = Integer.parseInt(data);
		// 출력

		tf.setText(data + cmd);
		// System.out.println(num);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
