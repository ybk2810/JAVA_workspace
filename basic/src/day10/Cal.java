package day10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
// �̺�Ʈ ó��
// 1. �̺�Ʈ �ҽ� ���� : Cal 
// 2. �����ʺ��� 
// 3. �ڵ鷯 ���� 
import java.awt.event.WindowListener;

public class Cal extends Frame implements ActionListener, WindowListener {

	Button btn1, btn2, btn3, btn4, btn5;
	Button btn6, btn7, btn8, btn9, btn0;
	Button btn00, btnEq, btnDi, btnMu;
	Button btnMi, btnPl;
	TextField tf;
	// Label lb;
	int firstNumber;
	String oper;

	Cal() {
		setTitle("����");
		setBounds(700, 0, 400, 500);
		setLayout(null);

		addWindowListener(this);

		tf = new TextField("0");
		Font f = new Font("�������", Font.BOLD, 40);
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

		// ��� ��ư�� ������ ����
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
		String cmd = e.getActionCommand();
		Object obj = e.getSource();

		String data = tf.getText().trim();
		Object String;
		if (obj == btnPl) {
			// ���ڷ� ������Ѽ� firstNumber������ ���
			firstNumber = Integer.parseInt(data);
			oper = "+";
			tf.setText("");
		} else if (obj == btnMi) {
			firstNumber = Integer.parseInt(data);
			oper = "-";
			tf.setText("");
		} else if (obj == btnMu) {
			firstNumber = Integer.parseInt(data);
			oper = "*";
			tf.setText("");
		} else if (obj == btnDi) {
			firstNumber = Integer.parseInt(data);
			oper = "/";
			tf.setText("");
		} else if (obj == btnEq) {

			// ��� ����
			int result = 0;
			int secondNumber = Integer.parseInt(data);
			if (oper.equals("+")) {
				result = firstNumber + secondNumber;
			} else if (oper.equals("-")) {
				result = firstNumber - secondNumber;
			} else if (oper.equals("*")) {
				result = firstNumber * secondNumber;
			} else if (oper.equals("/")) {
				result = firstNumber / secondNumber;
			}
			// ����� tf �� set
			tf.setText("" + result);
		} else {
			// ���ڹ�ư ������� ù��° ���ڸ� �߶� �� ���ڰ� 0�̸� �տ� ���ڸ� ���� �������� ����
			String front = data.substring(0, 1);
			if (front.equals("0")) {
				data = data.substring(1);
			}
			tf.setText(data + cmd);
		}

		System.out.println("firstNumber : " + firstNumber);
		System.out.println("oper : " + oper);

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

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

}
