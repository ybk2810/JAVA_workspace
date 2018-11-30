package day09;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin6 extends Frame {
	Button btnRed, btnBlue;
	MyWin6(){
		// 배치관리자 지정하는 메서드
		setLayout(null);
		
		// 버튼 초기화
		btnRed = new Button("OK");
		btnBlue = new Button("EXIT");
		
		// 컴포넌트의 크기와 위치를 직접지정
		btnRed.setSize(200,100);
		btnRed.setLocation(150, 400);
		btnBlue.setBounds(400,400,200,100);
		
		//버튼에 색칠하기
		btnRed.setBackground(Color.RED);
		btnBlue.setBackground(Color.BLUE);
		
		// 이벤트처리
		// 1. 이벤트소스 결정: btnBlue
		// 2. 리스너 부착
		Handler2 h = new Handler2();
		btnRed.addActionListener(h);
		btnBlue.addActionListener(h);
		
		
		// 버튼 부착
		add(btnRed);
		add(btnBlue);
		
		setBounds(100,100,800,600);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin6();
	}
}// class end

//1개의 파일에 1개의 클래스를 쓰는 것이 원칙
//클래스명과 동일한 이름의 파일 Test <==>Test.java

//public class는 안됨
class Handler2 implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("파랑버튼 클릭");
		String cmd = e.getActionCommand();
		System.out.println(cmd);
		if(cmd == "OK") {
			System.out.println("빨간버튼 눌림");
		}else if(cmd == "EXIT") {
			System.out.println("파란버튼 눌림");
		}
	}
}











