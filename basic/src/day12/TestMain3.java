package day12;

import java.util.ArrayList;

public class TestMain3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//¹®ÀÚ
		String str = "java";
		// String str = new String("java");
		int a = 20;
		
		// int->°´Ã¼
//		Integer it = new Integer(a);
		Integer it = 20; // autoBoxing
		int b = it; // unBoxing
		
		list.add(str);
		list.add(it);
		list.add(b);
		list.add(200);
		
		
		
		System.out.println("list: "+list);
//		String s = list.get(0);
		Object obj = list.get(0);
		String s = (String)obj;
		System.out.println(s);
		
		Object obj2 = list.get(1);
		Integer s1 = (Integer)obj2;
		int c = s1;
		System.out.println(c);
				
	}
}
