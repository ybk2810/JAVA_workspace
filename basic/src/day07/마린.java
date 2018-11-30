package day07;

// 변수의 종류
// 지역변수
// 전역변수(멤버변수)

public class 마린 extends Terran implements Flyable {
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

	마린(int 공격력, int hp, int 이동속도, int 공격속도) {
		this();
		this.공격력 = 공격력;
		this.hp = hp;
		this.이동속도 = 이동속도;
		this.공격속도 = 공격속도;
	}

	마린(int lebel) {
		this();
		this.공격력 = 공격력 + lebel * 4;
		this.hp = hp + lebel * 5;
		this.이동속도 = 이동속도 + lebel * 1;
		this.공격속도 = 공격속도 + lebel * 1;
	}

	void 공격하기(Terran m) {
		System.out.println("공격하기 메서드:" + m);
		m.hp -= 공격력;
		System.out.println("다다다다다다");
	}
	// void 공격하기(마린 m) {
	// System.out.println("공격하기 메서드:"+m);
	// m.hp-=공격력;
	// System.out.println("다다다다다다");
	// }
	//
	// void 공격하기(시즈탱크 m) {
	// System.out.println("------공격하기 메서드:"+m);
	// m.hp-=공격력;
	// System.out.println("다다다다다다");
	// }
	//
	// void 공격하기(메딕 m2) {
	// System.out.println("------공격하기 메서드:"+m2);
	// m2.hp-=공격력;
	// System.out.println("다다다다다다");
	// }

	void 스팀팩() {
		if (hp > 5) {
			hp -= 5;
			공격력 += 3;
			공격속도 += 2;
			이동속도 += 2;
			System.out.println("싸~~~ 아~~~");
		}
	}

	@Override
	public void fly() {
		System.out.println("날자");
		// TODO Auto-generated method stub
		
	}
	

}
