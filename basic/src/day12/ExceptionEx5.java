package day12;

import java.util.ArrayList;

public class ExceptionEx5 {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("����");
		list.add(500);
		list.add("����");
		list.add("���ξ���");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
