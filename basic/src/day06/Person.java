package day06;
// Objeck-->Class

// Ư��,����    member ����(�ʵ�)
//			������->
// ����,����	member method
//
// overloading => method�� ����

// TestMain
public class Person {
	String name;
	int age;
	String gender;
	int eye;
	String job;
	String hobby;

	// default constructor
	Person() {
		name = "����";
		age = 0;
		gender = "��";
		eye = 2;
		job = "����";
		hobby = "���";
		System.out.println("�⺻������");
	}

	Person(String name, String job, int age) {
		this();

		this.name = name;
		this.age = age;
		this.job = job;
		System.out.println("String, String, int �Ű����� �ִ� ������");
	}

	Person(String name, String job, int age, String gender) {
		// �ڱ� �ڽ��� ����Ű�� Ű����: this
		// �⺻�����ڸ� ������ �Ŀ� �ٸ� ���� ����
		this(name, job, age); // �⺻�����ڸ� ����

//		this.name = name;
//		this.age = age;
//		this.job = job;
		// ���� �������� ���� ��� ������ �⺻�� //hobby = "���";
		this.gender = "��";
		System.out.println("String, String, int, String �Ű����� �ִ� ������");
	}

	void eating() {
		System.out.println("�ȳ� �Ծ��");
	}

	void sleeping() {
		System.out.println("���� �ڷ�");
	}

	void thinking() {
		System.out.println("���� �����ؿ�");
	}
}
