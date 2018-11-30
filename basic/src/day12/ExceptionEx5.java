package day12;

import java.util.ArrayList;

public class ExceptionEx5 {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("딸기");
		list.add(500);
		list.add("수박");
		list.add("파인애플");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
