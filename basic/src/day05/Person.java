package day05;

// TestMain2, TestMain3
public class Person {
	// ��������� �������� (Global ����)
	// � method������ ���� �������� �ʾƵ� �νĵǴ� ����
	String name;
	String gender;
	int age;
	String job;
	String hobby;

	// �⺻�����ڴ� ���� ����
	Person() {
		// ��� ��������� ���� �⺻������ �ʱ�ȭ
		// int ==> 0, String ==> null
		name = "����";
		age = 20;
		job = "���";
		hobby = "������";
		System.out.println("�⺻ ������");
	}
	
	Person(String n, int a){
		name = n;
		age = a;
		job = "���";
		hobby = "������";
		gender = "��";
	}

	Person(String n, String n2, String n3){
		name = n;
		age = 20;
		job = n2;
		hobby = "������";
		gender = n3;
	}
	Person(String n1, String n2, String n3, int a){
		name = n1;
		age = a;
		job = n2;
		hobby = "������";
		gender = n3;
	}
	Person(String n1, String n2, int a, String n3){
		name = n1;
		age = a;
		job = n3;
		hobby = "������";
		gender = n2;
	}

	// ������
	// �̸��� Ŭ������� ����
	// ��ü�� �ʱ�ȭ(��������� �ʱ�ȭ)�� ���
	// Ư���� method, ��ü �����ðԸ� 1ȸ ����
	// ���ϰ��� ������, void Ű���� ���x

	void ���ϱ�() {
		System.out.println("�߾��߾�...");
	}

	void ���ڱ�() {
		System.out.println("����...");
	}

	void �Ա�() {
		System.out.println("�ȳ�...");
	}

	void �����ϱ�() {
		System.out.println("������ �� ����...?");
	}

}
