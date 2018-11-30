package day05;

// TestMain2, TestMain3
public class Person {
	// 멤버변수는 전역변수 (Global 변수)
	// 어떤 method에서도 따로 선언하지 않아도 인식되는 변수
	String name;
	String gender;
	int age;
	String job;
	String hobby;

	// 기본생성자는 생략 가능
	Person() {
		// 모든 멤버변수의 값을 기본값으로 초기화
		// int ==> 0, String ==> null
		name = "무명";
		age = 20;
		job = "백수";
		hobby = "숨쉬기";
		System.out.println("기본 생성자");
	}
	
	Person(String n, int a){
		name = n;
		age = a;
		job = "백수";
		hobby = "숨쉬기";
		gender = "남";
	}

	Person(String n, String n2, String n3){
		name = n;
		age = 20;
		job = n2;
		hobby = "숨쉬기";
		gender = n3;
	}
	Person(String n1, String n2, String n3, int a){
		name = n1;
		age = a;
		job = n2;
		hobby = "숨쉬기";
		gender = n3;
	}
	Person(String n1, String n2, int a, String n3){
		name = n1;
		age = a;
		job = n3;
		hobby = "숨쉬기";
		gender = n2;
	}

	// 생성자
	// 이름이 클래스명과 동일
	// 객체의 초기화(멤버변수의 초기화)를 담당
	// 특별한 method, 객체 생성시게만 1회 실행
	// 리턴값이 없지만, void 키워드 사용x

	void 말하기() {
		System.out.println("중얼중얼...");
	}

	void 잠자기() {
		System.out.println("쿨쿨...");
	}

	void 먹기() {
		System.out.println("냠냠...");
	}

	void 생각하기() {
		System.out.println("점심은 뭐 먹지...?");
	}

}
