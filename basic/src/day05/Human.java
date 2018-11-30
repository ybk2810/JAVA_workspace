package day05;

//TestMain5
public class Human {
	int eye, arm, age;
	String name, gender, job, 종특;

	Human() {
		name = "홍길동";
		eye = 2;
		gender = "남";
		arm = 2;
		age = 20;
		job = "도적";
		종특 = "스틸";
		System.out.println("기본 생성자");
	}

	void 스틸() {
		System.out.println("헛둘 헛둘");
	}

	void 빠르게달리기() {
		System.out.println("땀나게 달려요");
	}

	void 축지법() {
		System.out.println("동해 번쩍 서해 번쩍");
	}
}
