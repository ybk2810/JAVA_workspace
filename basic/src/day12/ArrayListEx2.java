package day12;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// Wrapper Class
		// �⺻�ڷ����� �̸� ==>
		byte a = 20;
		Byte b = new Byte(a);
		Byte c = new Byte("30");
		
		System.out.println(b.floatValue());
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int d = 20;
		
		Integer it = new Integer(d);
		
		System.out.println(Integer.toBinaryString(d));
		
		// primitive type ������ ��ü
		// ������� Ŭ����

		list.add("����");
		list.add(200);
	}
}
