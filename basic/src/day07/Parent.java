package day07;

public class Parent {
	String name;
	int age;
	String job;
	String sex;
	
	Parent(String name){
		this();
		this.name = name;
	}
	
	public Parent() {
		System.out.println("Parent 클래스의 기본 생성자");
		name = "홍판석";
		age = 40;
		job = "공무원";
		sex = "남자";
	}
	
	public void 먹기() {
		System.out.println("맛있는거 먹어요");
	}
	public void 자기() {
		System.out.println("자요");
	}
	public void 노래부르기() {
		System.out.println("룰루랄라");
	}
	public void 잔소리하기() {
		System.out.println("Fucking");
	}
	public void 청소하기() {
		System.out.println("dirty");
	}
}
