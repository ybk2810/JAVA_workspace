package day04;

// VendingMachine
// 1. ����ڷκ��� ���ڸ� �Է¹޴´�. ������ �Է��ϼ���: 50000
// 	1.�ݶ� 1200
// 	2.���̴� 1600
// 	3.���� 2500
// 2.�޴��� �����ϼ���: 2
// 3.�?: 3
// ���̴� 3�� �ܵ� ��� 45200��
// ���� 4��, 5��õ�� 1�� ��� 2��
import java.util.Scanner;

public class Hw0604No1 {
	public static void main(String[] args) {
		System.out.print("���� �Ա��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.println("1.�ݶ�: 1200��");
		System.out.println("2.���̴�: 1600��");
		System.out.println("3.����: 2500��");
		System.out.print("�޴��� ������:");
		int order_menu = sc.nextInt();

		System.out.print("����: ");
		int order_amount = sc.nextInt();

		String[] name = { "�ݶ�", "���̴�", "����" };
		System.out.println(name[order_menu - 1] + order_amount + "��");

		int[] menu = { 1200, 1600, 2500 };
		int change = money - (menu[order_menu - 1] * order_amount);
		System.out.println("�ܵ�: " + change + "���Դϴ�.");

		int ocheon = 0;
		int cheon = 0;
		int obeak = 0;
		int beak = 0;

		ocheon = change / 5000;
		cheon = change % 5000 / 1000;
		obeak = change % 5000 % 1000 / 500;
		beak = change % 5000 % 1000 % 500 / 100;

		if (ocheon != 0)
			System.out.println("��õ�� : " + ocheon);
		if (cheon != 0)
			System.out.println("õ�� : " + cheon);
		if (obeak != 0)
			System.out.println("����� : " + obeak);
		if (beak != 0)
			System.out.println("��� : " + beak);
		sc.close();
	}
}
