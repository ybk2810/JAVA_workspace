package day06;

// 변수의 종류
// 지역변수
// 전역변수(멤버변수)

public class 마린 {
	int lebel, x, y, hp, 사거리, 공격력, 방어력, 공격속도, 이동속도;

	마린() {
		lebel = 1;
		x = 0;
		y = 0;
		hp = 100;
		사거리 = 5;
		공격력 = 4;
		이동속도 = 3;
		공격속도 = 2;
	}
	
	마린(int 공격력,int hp) {
		this();
		this.공격력 = 공격력;
		this.hp = hp;
		this.이동속도 = 이동속도;
		this.공격속도 = 공격속도;
	}

	마린(int lebel) {
		this();
		this.공격력 = 공격력+lebel*4;
		this.hp = hp+lebel*5;
		this.이동속도 = 이동속도+lebel*1;
		this.공격속도 = 공격속도+lebel*1;
	}

	void 공격하기() {
		System.out.println("두두두두두");
	}
	
	void 공격하기(마린 m) {
		System.out.println("공격하기 메서드:"+m);
		m.hp-=공격력;
		System.out.println("다다다다다다");
	}
	
	void 공격하기(시즈탱크 m) {
		System.out.println("------공격하기 메서드:"+m);
		m.hp-=공격력;
		System.out.println("다다다다다다");
	}
	
	void 이동하기() {
		System.out.println("옜!! 써얼..");
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
