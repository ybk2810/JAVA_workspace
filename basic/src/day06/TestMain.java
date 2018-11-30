package day06;

// Person
public class TestMain {
	public static void main(String[] args) {
		Person p = new Person("슈퍼맨", "사진기자", 30);

		System.out.println(p.age); // 0
		System.out.println(p.gender); // null
		p.thinking();
		p.eating();

		System.out.println("-----------");
		Person p2 = new Person("타노스", "백수", 100, "남");
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.hobby);

	}
}
