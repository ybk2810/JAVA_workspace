package day09;
// static 변수

// instance 변수

public class Test {
	static int a;
	int b;
	static {
		System.out.println("이것은 static block 입니다.");
	}
	Test(){
		a = 100;
		b = 200;
		System.out.println("기본생성자");
	}
	
	//일반 method
	public void printTest() {
		System.out.println("aaaa");
	}
	
	//static method
	public static void printStaticTest() {
		System.out.println("Static method");
	}
	
}
