package day05;

public class TestMain2 {
	public static void main(String[] args) {
		Person p;
		p = new Person();

		// System.out.println("p: "+p); //stack �ּ�

		// 20�� ȫ�浿 ���� ��ġ�� ����
		p.age = 20;
		p.name = "ȫ�浿";
		p.job = "����";
		p.hobby = "��ġ��";
		p.gender = "����";

		// System.out.println(p.name); // stack c���� heap���� ã�ư�
		System.out.println("name: " + p.name);
		System.out.println("job: " + p.job);
		p.���ϱ�();
		p.�����ϱ�();
		p.�Ա�();
		p.���ڱ�();

		// �鼳����
		Person p2;
		p2 = new Person();
		p2.age = 20;
		p2.name = "�鼳";
		p2.job = "����";
		p2.hobby = "����";
		p2.gender = "����";

		System.out.println("age: " + p2.age);
		System.out.println("name: " + p2.name);
		System.out.println("job: " + p2.job);
		System.out.println("hobby: " + p2.hobby);
		System.out.println("gender: " + p2.gender);

	}

}
// stack
// p

// heap
// name, gender