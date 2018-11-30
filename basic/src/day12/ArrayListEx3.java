package day12;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// Collection: 포용적..
		// 모든 객체를 담을수 있도록 설계
		list.add("뽀로로");
		list.add(500);
		list.add("이번주는 5일 ㅠㅠ");
		
		for (int i = 0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			String str = (String)obj;
			System.out.println(list.get(i));
		}
		
		
		
	}
}
