package day09;
// static ����

// instance ����

public class Test {
	static int a;
	int b;
	static {
		System.out.println("�̰��� static block �Դϴ�.");
	}
	Test(){
		a = 100;
		b = 200;
		System.out.println("�⺻������");
	}
	
	//�Ϲ� method
	public void printTest() {
		System.out.println("aaaa");
	}
	
	//static method
	public static void printStaticTest() {
		System.out.println("Static method");
	}
	
}
