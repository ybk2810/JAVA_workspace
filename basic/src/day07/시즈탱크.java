package day07;

public class 시즈탱크 extends Terran {

	시즈탱크() {
		lebel = 1;
		x = 0;
		y = 0;
		hp = 100;
		사거리 = 3;
		공격력 = 10;
		이동속도 = 4;
		공격속도 = 2;
	}

	시즈탱크(int lebel) {
		this();
		this.공격력 = 공격력 + lebel * 4;
		this.hp = hp + lebel * 5;
		this.이동속도 = 이동속도 + lebel * 1;
		this.공격속도 = 공격속도 + lebel * 1;
	}

	void 공격하기(마린 m) {
		System.out.println("------공격하기 메서드:" + m);
		m.hp -= 공격력;
		System.out.println("타타ㅏ타탙");
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

}
