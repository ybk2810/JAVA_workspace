package day12;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		
		System.out.println(v.size());
		v.add("����");
		v.add("�޷�");
		v.add("����");
		v.add("����");
		v.add("���");
		v.add("�θ���");
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
