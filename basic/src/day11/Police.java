package day11;
// 상속의 관계(is-a관계)

// A is B 인 경우 A는 B를 상속받을 수 있다.
//

// A has a B

public class Police extends Gun {
	Gun g; // 멤버변수
	Weapon w;
	String name;
	String gender;
	int age;

	Police() {
		g = new Gun();
		Weapon w;
		name = "포돌이";
		gender = "남";
		age = 20;
	}

	Police(Weapon w) {
		this.w = w;
		g = new Gun();
		name = "포돌이";
		gender = "남";
		age = 20;
	}
//	public void setWeapon(Weapon w) {
//		this.w = w;
//	}

	public Gun getG() {
		return g;
	}

	public void setG(Gun g) {
		this.g = g;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void 순찰하기() {
		System.out.println();
	}

	public void 체포하기() {
		System.out.println("묵비권");
	}

	public void 무기사용() {
		g.fire();
	}

	public void 도너츠먹기() {
		System.out.println("냠냠");
	}
}
