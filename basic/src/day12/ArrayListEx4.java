package day12;

import java.util.ArrayList;

public class ArrayListEx4 {
	public static void main(String[] args) {
		// 이 ArrayList는 String 클래스 전용입니다.
		// 다른 값은 넣지 말아주세요.
		
		ArrayList<String> list = new ArrayList<String>();
		//
		// 제너릭
		// ArrayList 제너릭 타입으로 설계
		list.add("딸기");
//		list.add(20); // String 전용
		list.add("포도");
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
	}
}
