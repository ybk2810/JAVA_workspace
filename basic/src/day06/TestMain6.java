package day06;

// ��� 
// method overriding ������
// method signiture�� ������ ������(��Ӱ���)

public class TestMain6 {
	public static void main(String[] args) {
//		Parent p = new Parent();
		Child c = new Child();
//		
//		
//		System.out.println("-------------");
//		System.out.println("name: "+p.name);
//		System.out.println("age: "+p.age);
//		System.out.println("job: "+p.job);
//		System.out.println("sex: "+p.sex);
//		p.�Ա�();
//		p.�ڱ�();
//		p.�뷡�θ���();
//		p.�ܼҸ��ϱ�();
//		
		System.out.println("-------------");
		System.out.println("name: "+c.name);
		System.out.println("age: "+c.age);
		System.out.println("job: "+c.job);
		System.out.println("sex: "+c.sex);
		c.�Ա�();
		c.�ڱ�();
		c.�뷡�θ���();
		c.Ŭ������();
//		
//		System.out.println("-------------");
//		System.out.println("-------------");
//		
		
	}
}
