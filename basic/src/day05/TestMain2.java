package day05;

public class TestMain2 {
	public static void main(String[] args) {
		Person p;
		p = new Person();

		// System.out.println("p: "+p); //stack 주소

		// 20살 홍길동 도적 훔치기 남성
		p.age = 20;
		p.name = "홍길동";
		p.job = "도적";
		p.hobby = "훔치기";
		p.gender = "남성";

		// System.out.println(p.name); // stack c에서 heap으로 찾아감
		System.out.println("name: " + p.name);
		System.out.println("job: " + p.job);
		p.말하기();
		p.생각하기();
		p.먹기();
		p.잠자기();

		// 백설공주
		Person p2;
		p2 = new Person();
		p2.age = 20;
		p2.name = "백설";
		p2.job = "백조";
		p2.hobby = "가출";
		p2.gender = "여성";

		System.out.println("age: " + p2.age);
		System.out.println("name: " + p2.name);
		System.out.println("job: " + p2.job);
		System.out.println("hobby: " + p2.hobby);
		System.out.println("gender: " + p2.gender);

	}

}
// stack
// p

// heap
// name, gender