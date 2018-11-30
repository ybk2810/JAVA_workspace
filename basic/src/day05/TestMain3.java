package day05;

public class TestMain3 {
	public static void main(String[] args) {
		// 객체를 초기화
		// int[] m = new int[3];
		// 클래스명 참조변수명 = new 생성자();

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("김영복", 26);
		Person p4 = new Person("백설", "공주", "여");
		Person p5 = new Person("왕비", "사과장수", "여", 50);
		Person p6 = new Person("난장이", "남", 40, "나무꾼");

		// 생성자: 객체의 초기화를 쉽게 할 목적으로 가지고 있는 특별한 용도의 method

		p2.name = "홍길동";
		p2.age = 30;
		p2.job = "백수";
		p2.hobby = "숨쉬기";

		System.out.println("age: " + p1.age);
		System.out.println("name: " + p1.name);
		System.out.println("job: " + p1.job);
		System.out.println("hobby: " + p1.hobby);
		System.out.println("gender: " + p1.gender);

		System.out.println("------------------");

		System.out.println("age: " + p2.age);
		System.out.println("name: " + p2.name);
		System.out.println("job: " + p2.job);
		System.out.println("hobby: " + p2.hobby);
		System.out.println("gender: " + p2.gender);

		System.out.println("------------------");

		System.out.println("age: " + p3.age);
		System.out.println("name: " + p3.name);
		System.out.println("job: " + p3.job);
		System.out.println("hobby: " + p3.hobby);
		System.out.println("gender: " + p3.gender);

		System.out.println("------------------");

		System.out.println("age: " + p4.age);
		System.out.println("name: " + p4.name);
		System.out.println("job: " + p4.job);
		System.out.println("hobby: " + p4.hobby);
		System.out.println("gender: " + p4.gender);

		System.out.println("------------------");

		System.out.println("age: " + p5.age);
		System.out.println("name: " + p5.name);
		System.out.println("job: " + p5.job);
		System.out.println("hobby: " + p5.hobby);
		System.out.println("gender: " + p5.gender);

		System.out.println("------------------");

		System.out.println("age: " + p6.age);
		System.out.println("name: " + p6.name);
		System.out.println("job: " + p6.job);
		System.out.println("hobby: " + p6.hobby);
		System.out.println("gender: " + p6.gender);
	}
}

// stack
// p1(#100)

// heap
// (#100) (#200)
// name 무명 name 무명
// age 20 age 20
// job 백수 job 백수
// hobby 숨쉬기 hobby 숨쉬기
