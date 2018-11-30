package day12;

import java.util.Stack;

public class TestMain {
	public static void main(String[] args) {
		// 러시아 월드컵
		// 프랑스 독일 스페인 브라질 아르헨티나, 한국
		Stack s = new Stack();
		// Stack 구조
		
		s.push("프랑스");
		s.push("독일");
		s.push("스페인");
		s.push("브라질");
		s.push("아르헨티나");
		s.push("한국");
		
		System.out.println("s: "+s);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
