package day07;

//추상화
//반대로 마린, 메딕, 시즈탱크는 구체화
public class Terran {
	int lebel, x, y, hp, 사거리, 공격력, 방어력, 공격속도, 이동속도;

	void 공격하기() {
		System.out.println("두두두두두");
	}

	void 이동하기() {
		System.out.println("옜!! 써얼..");
	}

	void 홀드() {
		System.out.println("거기서");
	}

	void 패트롤() {
		System.out.println("근무중 이상무~~~");
	}

	void status() {
		System.out.println("---------------");
		System.out.println("체력: " + hp);
		System.out.println("사거리: " + 사거리);
		System.out.println("공격력: " + 공격력);
		System.out.println("방어력: " + 방어력);
	}

	void 사망() {
		System.out.println("사망~~~");
	}

}
