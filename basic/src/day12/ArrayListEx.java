package day12;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		
		System.out.println(v.size());
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
		
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
	}
}
