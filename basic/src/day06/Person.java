package day06;
// Objeck-->Class

// 특성,성질    member 변수(필드)
//			생성자->
// 행위,동작	member method
//
// overloading => method명 동일

// TestMain
public class Person {
	String name;
	int age;
	String gender;
	int eye;
	String job;
	String hobby;

	// default constructor
	Person() {
		name = "무명";
		age = 0;
		gender = "남";
		eye = 2;
		job = "유아";
		hobby = "울기";
		System.out.println("기본생성자");
	}

	Person(String name, String job, int age) {
		this();

		this.name = name;
		this.age = age;
		this.job = job;
		System.out.println("String, String, int 매개변수 있는 생성자");
	}

	Person(String name, String job, int age, String gender) {
		// 자기 자신을 가리키는 키워드: this
		// 기본생성자를 실행한 후에 다른 값만 지정
		this(name, job, age); // 기본생성자를 실행

//		this.name = name;
//		this.age = age;
//		this.job = job;
		// 지금 지정되지 않은 모든 변수는 기본값 //hobby = "울기";
		this.gender = "남";
		System.out.println("String, String, int, String 매개변수 있는 생성자");
	}

	void eating() {
		System.out.println("냠냠 먹어요");
	}

	void sleeping() {
		System.out.println("쿨쿨 자료");
	}

	void thinking() {
		System.out.println("나는 생각해요");
	}
}
