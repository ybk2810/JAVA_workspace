package day12;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// 과일 목록을 String[] sList에 담기
		// 딸기, 메론, 수박, 참외, 사과, 두리안
		Vector v = new Vector();
		System.out.println("배열 사용갯수: " + v.size());
		System.out.println("배열 공간: " + v.capacity());
		
		// add() 추가
		v.add("딸기");
		v.add("메론");
		v.add("수박");
		v.add("참외");
		v.add("사과");
		v.add("두리안");
		v.add("v");
		v.add("v");
		v.add("v");
		v.add("v");
		v.add("v");
		
		System.out.println("배열 사용갯수: " + v.size());
		System.out.println("배열 공간: " + v.capacity());
		
		String[] sList = {"딸기", "메론", "수박", "참외", "사과", "두리안"};
		
		//
		for(int i = 0; i<v.size(); i++) {
			Object obj = v.get(i);
			String str = (String)obj;
			System.out.println(str);
		}
		
		
		// 화면에 출력
		for(String x: sList) {
			System.out.println(sList);
		}
		
	}
}
