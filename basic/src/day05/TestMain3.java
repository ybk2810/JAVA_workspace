package day05;

public class TestMain3 {
	public static void main(String[] args) {
		// ��ü�� �ʱ�ȭ
		// int[] m = new int[3];
		// Ŭ������ ���������� = new ������();

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("�迵��", 26);
		Person p4 = new Person("�鼳", "����", "��");
		Person p5 = new Person("�պ�", "������", "��", 50);
		Person p6 = new Person("������", "��", 40, "������");

		// ������: ��ü�� �ʱ�ȭ�� ���� �� �������� ������ �ִ� Ư���� �뵵�� method

		p2.name = "ȫ�浿";
		p2.age = 30;
		p2.job = "���";
		p2.hobby = "������";

		System.out.println("age: " + p1.age);
		System.out.println("name: " + p1.name);
		System.out.println("job: " + p1.job);
		System.out.println("hobby: " + p1.hobby);
		System.out.println("gender: " + p1.gender);

		System.out.println("------------------");

		System.out.println("age: " + p2.age);
		System.out.println("name: " + p2.name);
		System.out.println("job: " + p2.job);
		System.out.println("hobby: " + p2.hobby);
		System.out.println("gender: " + p2.gender);

		System.out.println("------------------");

		System.out.println("age: " + p3.age);
		System.out.println("name: " + p3.name);
		System.out.println("job: " + p3.job);
		System.out.println("hobby: " + p3.hobby);
		System.out.println("gender: " + p3.gender);

		System.out.println("------------------");

		System.out.println("age: " + p4.age);
		System.out.println("name: " + p4.name);
		System.out.println("job: " + p4.job);
		System.out.println("hobby: " + p4.hobby);
		System.out.println("gender: " + p4.gender);

		System.out.println("------------------");

		System.out.println("age: " + p5.age);
		System.out.println("name: " + p5.name);
		System.out.println("job: " + p5.job);
		System.out.println("hobby: " + p5.hobby);
		System.out.println("gender: " + p5.gender);

		System.out.println("------------------");

		System.out.println("age: " + p6.age);
		System.out.println("name: " + p6.name);
		System.out.println("job: " + p6.job);
		System.out.println("hobby: " + p6.hobby);
		System.out.println("gender: " + p6.gender);
	}
}

// stack
// p1(#100)

// heap
// (#100) (#200)
// name ���� name ����
// age 20 age 20
// job ��� job ���
// hobby ������ hobby ������
