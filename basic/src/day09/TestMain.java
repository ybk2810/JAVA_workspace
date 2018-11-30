package day09;

public class TestMain {
	public static void main(String[] args) {
		System.out.println(Test.a); // 0
		
		Test.printStaticTest();
		
		Test t = new Test(); //instance
		System.out.println(t.b); //200
		
		t.printTest();
		
		System.out.println(t.a); //100
	}
}
