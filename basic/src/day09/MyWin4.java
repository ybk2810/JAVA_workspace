package day09;
// 버튼을 좀 적당한 크기로 배치

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyWin4 extends Frame {
Button btnEast;
Button btnWest;
Button btnNorth;
Button btnSouth;
Button btnCenter;
	
MyWin4(){
		setTitle("버튼만들기");
		
		//x,y,너비,높이
		setBounds(300,300,300,300);
//		setSize(300, 300);
//		setLocation(300, 300);
		
		//FlowLayout
		FlowLayout f1 = new FlowLayout();
		
		//배치관리자 변경
		setLayout(f1);
		
		
		// 배치관리자 (Lyout Manager)
		// Frame의 기본 배치관리자
		// BorderLayout
		
		// 컴포넌트 초기화
		btnEast = new Button("East");
		btnWest = new Button("West");
		btnNorth = new Button("North");
		btnSouth = new Button("South");
		btnCenter = new Button("Center");
		
//		Handler h = new Handler();
//		btn1.addActionListener(h);
//		btn2.addActionListener(h);
		
		add(btnEast,"East");
		add(btnWest,"West");
		add(btnNorth,"North");
		add(btnSouth,"South");
		add(btnCenter,"Center");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin4 mw = new MyWin4();
	}
}
