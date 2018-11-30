package day07;

public class TestMain2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		System.out.println("c: "+c);
		p = c;
		p.노래부르기();
		System.out.println("p: "+p);
		
		//p: 자식클래스의 참조값
//		Child c1 = c;
		Child c2 = (Child)p;
		//자식참조변수에 부모의 참조갑 대입 
		System.out.println("c2: "+c2);
		c2.클럽가기();
	}
}
