package day12;

import java.util.Stack;

public class TestMain {
	public static void main(String[] args) {
		// ���þ� ������
		// ������ ���� ������ ����� �Ƹ���Ƽ��, �ѱ�
		Stack s = new Stack();
		// Stack ����
		
		s.push("������");
		s.push("����");
		s.push("������");
		s.push("�����");
		s.push("�Ƹ���Ƽ��");
		s.push("�ѱ�");
		
		System.out.println("s: "+s);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
