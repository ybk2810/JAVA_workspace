package day12;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// Collection: ������..
		// ��� ��ü�� ������ �ֵ��� ����
		list.add("�Ƿη�");
		list.add(500);
		list.add("�̹��ִ� 5�� �Ф�");
		
		for (int i = 0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			String str = (String)obj;
			System.out.println(list.get(i));
		}
		
		
		
	}
}
