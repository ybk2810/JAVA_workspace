package day06;

public class TestMain4 {
	public static void main(String[] args) {

		���� m1 = new ����();
		���� m2 = new ����(10, 500);
		�޵� me = new �޵�();
		// Person p = new Person("�丣", "��", 500);

		m1.�����ϱ�();
		m1.�̵��ϱ�();

		System.out.println("m1.hp: " + m1.hp);
		System.out.println("m1.���ݷ�: " + m1.���ݷ�);

		System.out.println("m2.hp: " + m2.hp);
		System.out.println("m2.���ݷ�: " + m2.���ݷ�);

		// p = m1;
		// m2=m1;
		// System.out.println(m2.hp);

		m2.status();
		System.out.println("------------");
		System.out.println("main method" + m2);
		m1.�����ϱ�(m2);
		m2.status();

		System.out.println("------------");
		me.ġ��(m2);// call by reference
		m2.status();
	}
}
// java �̸� ���� ��Ģ
// 1.A~Z,a~z,0~9,_,$
// 2.ù���� ����
// 3.����� ��������.
// 4.�ǹ��ְ�
// 5.����x
//
// Ŭ������ 
// ù���ڴ� �빮��, �������� �ҹ���
// �ΰ� �̻��� �ܾ�: �ռ��� ex)BigData
//
// ������
// ù���� �ҹ���
// �ΰ� �̻��� �ܾ�: �ռ��� �޴ܾ��� ù���� �빮�� ex)smallValue
//
// method��
// ù���� �ҹ���
// ()�پ�� method
// �ΰ� �̻��� �ܾ�: �ռ��� �޴ܾ��� ù���� �빮�� ex)smallValue
//
// ������
// ù���� �빮��
// ()�پ�� method
// �ΰ� �̻��� �ܾ�: �ռ��� �޴ܾ��� ù���� �빮�� ex)smallValue
//
// ���
// ��� �빮��
// MAXVALUE
// �ռ����� ��� _ ���� MAX_VALUE

//GuestData Ŭ������
//getNumber() method��
//Test() �����ڸ�
//SMALL_DATA ���
//value ����
//setValue() method��
//BoardTest Ŭ������
//Tech() �����ڸ�
//NumberValue Ŭ������
//TEST_VALUE ���





