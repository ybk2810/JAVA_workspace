package day09;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hw0612No04 extends Frame implements ActionListener {
	Button btn1, btn2, btn3, btn4;
	Button btn5, btn6, btn7, btn8;
	Button btn9, btn0, btn00, btnEq;
	Button btnPl, btnMi, btnMu, btnDi;
	TextField tf;
	String txt;
	int num;
	
	
	Hw0612No04(){
		setLayout(null);
		tf = new TextField();
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
		btnPl = new Button("+");
		btnMi = new Button("-");
		btnMu = new Button("*");
		btnDi = new Button("/");
		
		tf.setBounds(50, 50, 350, 50);
		btn1.setBounds(50, 350, 50, 50);
		btn2.setBounds(150, 350, 50, 50);
		btn3.setBounds(250, 350, 50, 50);
		btn4.setBounds(50, 250, 50, 50);
		btn5.setBounds(150, 250, 50, 50);
		btn6.setBounds(250, 250, 50, 50);
		btn7.setBounds(50, 150, 50, 50);
		btn8.setBounds(150, 150, 50, 50);
		btn9.setBounds(250, 150, 50, 50);
		btn0.setBounds(50, 450, 50, 50);
		btn00.setBounds(150, 450, 50, 50);
		btnEq.setBounds(250, 450, 50, 50);
		btnPl.setBounds(350, 150, 50, 50);
		btnMi.setBounds(350, 250, 50, 50);
		btnMu.setBounds(350, 350, 50, 50);
		btnDi.setBounds(350, 450, 50, 50);
		
		add(tf);
		add(btn1);add(btn2);add(btn3);add(btn4);
		add(btn5);add(btn6);add(btn7);add(btn8);
		add(btn9);add(btn0);add(btn00);add(btnEq);
		add(btnPl);add(btnMi);add(btnMu);add(btnDi);
		
		
		setTitle("Calculator");
		setBounds(0,0,450,550);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Hw0612No04 mw = new Hw0612No04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
	}
}
