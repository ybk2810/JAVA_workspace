package day06;

//��� 
public class Child extends Parent {

	
	Child(){
//		super("ȫ�浿");	// ��ҿ� �����Ǿ�����
		super.name = "ȫ�浿"; // ���� ����Ű�� ������ this, �θ� ����Ű�� Ű����� super
		age = 20;
		//job = "����";
		sex = "����";
		System.out.println("Child Ŭ������ �⺻ ������");
	}
	
	// @Ű���� 
	@Override	//annotation �������̵��Ϸ��� �ϴ� �޼��� ���� ���� 
	public void �뷡�θ���() {
		System.out.println("a\r\n"+"bcd");
	}
	public void Ŭ������() {
		System.out.println("�ȳ�");
	}
}
