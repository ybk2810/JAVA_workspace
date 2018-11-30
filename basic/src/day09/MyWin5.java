package day09;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyWin5 extends Frame {
	
	MyWin5(){
		setTitle("배치관리자테스트");
		setBounds(100,100,800,600);
		
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		
		Button[] btn = new Button[50];
		for(int i = 0; i<btn.length; i++) {
			btn[i] = new Button((i+1)+"button");
			add(btn[i]);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWin5 mw = new MyWin5();
	}
}
