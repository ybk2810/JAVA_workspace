package day08;

import java.awt.Frame;

public class TestMain3 {
	public static void main(String[] args) {
		Math.random();// static
		System.out.println(Math.PI);//PI는 상수이면서 static
		// Sun --> oracle 개발자들이 만들어 놓은 많은 클래스와 메서드
		// API Document
		
		Frame f = new Frame();
		f.setSize(300,300);
		f.setVisible(true);
		
//		Math.PI;
	}
}
