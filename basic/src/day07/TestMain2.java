package day07;

public class TestMain2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		System.out.println("c: "+c);
		p = c;
		p.�뷡�θ���();
		System.out.println("p: "+p);
		
		//p: �ڽ�Ŭ������ ������
//		Child c1 = c;
		Child c2 = (Child)p;
		//�ڽ����������� �θ��� ������ ���� 
		System.out.println("c2: "+c2);
		c2.Ŭ������();
	}
}
