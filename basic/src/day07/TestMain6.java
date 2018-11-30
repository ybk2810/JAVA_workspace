package day07;

public class TestMain6 {
	public static void main(String[] args) {
		마린 m = new 마린();
		말 h = new 말();
		
		m.fly();
		h.fly();
		System.out.println("----------------");
		
		// 양아버지?, 대부?
		Flyable f;
		f = m;
		f.fly();
		f = h;
		f.fly();
		//다형성: 동일한 조작방법으로 동작시키지만 대상에 따라 다른 실행을 하게 하는 것
		
		//객체지향언어의 특징 4
		//1.encapsulation
		//2.inferitance
		//3.Abstraction
		//4.polymorphism
		
		
		
		
		
		
	}
}
