package day07;

public class 메딕 extends Terran {
	int mp, 치료력, 사정거리;

	메딕() {
		System.out.println("기본 생성자");
		hp = 100;
		mp = 100;
		치료력 = 3;
		방어력 = 5;
		x = 0;
		y = 0;
		이동속도 = 5;
		사정거리 = 3;
	}

	void 치료() {
		System.out.println("빨간약");
	}

	void 치료(마린 m) {
		System.out.println("빨간약++");
		m.hp += 치료력;
	}

	void status() {
		System.out.println("---------------");
		System.out.println("체력: " + hp);
		System.out.println("사정거리: " + 사정거리);
		System.out.println("치료력: " + 치료력);
		System.out.println("방어력: " + 방어력);
	}

	void 사망() {
		System.out.println("사망~~~");
	}
}
