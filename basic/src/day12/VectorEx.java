package day12;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// ���� ����� String[] sList�� ���
		// ����, �޷�, ����, ����, ���, �θ���
		Vector v = new Vector();
		System.out.println("�迭 ��밹��: " + v.size());
		System.out.println("�迭 ����: " + v.capacity());
		
		// add() �߰�
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
		
		System.out.println("�迭 ��밹��: " + v.size());
		System.out.println("�迭 ����: " + v.capacity());
		
		String[] sList = {"����", "�޷�", "����", "����", "���", "�θ���"};
		
		//
		for(int i = 0; i<v.size(); i++) {
			Object obj = v.get(i);
			String str = (String)obj;
			System.out.println(str);
		}
		
		
		// ȭ�鿡 ���
		for(String x: sList) {
			System.out.println(sList);
		}
		
	}
}
