package day05;

// TestMain4
public class 마린 {
	int x, y, hp, 공격력, 방어력, 사거리;
	int 이동속도, 공격속도;

	public 마린() {
		x = 0;
		y = 0;
		hp = 100;
		공격력 = 4;
		방어력 = 3;
		사거리 = 3;
		이동속도 = 4;
		공격속도 = 3;
		System.out.println("기본 생성자");
	}

	void 공격하기() {
		System.out.println("뚜뚜뚜뚜~~~");
	}

	void 이동하기() {
		System.out.println("옜!! 써얼..");
	}

	void 사망하기() {
		System.out.println("으악~~~~");
	}

	void 패트롤() {
		System.out.println("근무중 이상무~~~");
	}

	void 스팀팩() {
		if (hp > 5) {
			hp -= 5;
			공격력 += 3;
			공격속도 += 2;
			이동속도 += 2;
			System.out.println("싸~~~ 아~~~");
		}
	}

	void status() {
		System.out.println("---------------");
		System.out.println("체력: " + hp);
		System.out.println("사거리: " + 사거리);
		System.out.println("공격력: " + 공격력);
		System.out.println("방어력: " + 방어력);
	}
}
