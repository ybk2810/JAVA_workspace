package day11;
// ����� ����(is-a����)

// A is B �� ��� A�� B�� ��ӹ��� �� �ִ�.
//

// A has a B

public class Police extends Gun {
	Gun g; // �������
	Weapon w;
	String name;
	String gender;
	int age;

	Police() {
		g = new Gun();
		Weapon w;
		name = "������";
		gender = "��";
		age = 20;
	}

	Police(Weapon w) {
		this.w = w;
		g = new Gun();
		name = "������";
		gender = "��";
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

	public void �����ϱ�() {
		System.out.println();
	}

	public void ü���ϱ�() {
		System.out.println("�����");
	}

	public void ������() {
		g.fire();
	}

	public void �������Ա�() {
		System.out.println("�ȳ�");
	}
}
