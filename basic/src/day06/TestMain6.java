package day06;

// 상속 
// method overriding 재정의
// method signiture가 같으면 가능함(상속관계)

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
//		p.먹기();
//		p.자기();
//		p.노래부르기();
//		p.잔소리하기();
//		
		System.out.println("-------------");
		System.out.println("name: "+c.name);
		System.out.println("age: "+c.age);
		System.out.println("job: "+c.job);
		System.out.println("sex: "+c.sex);
		c.먹기();
		c.자기();
		c.노래부르기();
		c.클럽가기();
//		
//		System.out.println("-------------");
//		System.out.println("-------------");
//		
		
	}
}
