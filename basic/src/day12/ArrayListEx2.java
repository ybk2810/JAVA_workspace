package day12;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// Wrapper Class
		// 기본자료형의 이름 ==>
		byte a = 20;
		Byte b = new Byte(a);
		Byte c = new Byte("30");
		
		System.out.println(b.floatValue());
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int d = 20;
		
		Integer it = new Integer(d);
		
		System.out.println(Integer.toBinaryString(d));
		
		// primitive type 변수를 객체
		// 만들어줄 클래스

		list.add("포도");
		list.add(200);
	}
}
