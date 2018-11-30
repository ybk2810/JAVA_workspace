package day09;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hw0612No03 extends Frame implements ActionListener {
	Button btnOutput, btnExit;
	Label lb;
	TextField tf;
	String txt;
	int dan;
	
	Hw0612No03(){
		setLayout(null);
		lb = new Label("��??");
		tf = new TextField();
		btnOutput = new Button("���");
		btnExit = new Button("����");
		
		btnOutput.setBounds(200, 400, 100, 50);
		btnExit.setBounds(400, 400, 100, 50);
		lb.setBounds(50, 50, 250, 50);
		tf.setBounds(100, 100, 100, 100);
		tf.setText("���⿡ �Է���");
		
		btnOutput.addActionListener(this);
		btnExit.addActionListener(this);
		tf.addActionListener(this);
		
		add(btnOutput);
		add(btnExit);
		add(lb);
		add(tf);

		setBounds(100,100,800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Hw0612No03();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		System.out.println(obj);
		if(obj == btnOutput) {
			txt = tf.getText();
			dan = Integer.parseInt(txt);
			System.out.println(dan+"�� ���");
			for(int i=1;i<=9;i++) {
				System.out.println(
						dan + " * " + i + " = " + dan*i);
			}
		}else if(obj == btnExit) {
			System.out.println("�����մϴ�.");
			System.exit(0);
		}
	}

}
