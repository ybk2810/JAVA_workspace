package day12;

import java.util.ArrayList;

public class ArrayListEx4 {
	public static void main(String[] args) {
		// �� ArrayList�� String Ŭ���� �����Դϴ�.
		// �ٸ� ���� ���� �����ּ���.
		
		ArrayList<String> list = new ArrayList<String>();
		//
		// ���ʸ�
		// ArrayList ���ʸ� Ÿ������ ����
		list.add("����");
//		list.add(20); // String ����
		list.add("����");
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
	}
}
