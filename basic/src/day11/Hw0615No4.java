package day11;

import java.util.Calendar;
import java.util.Scanner;

import day10.Cal;

public class Hw0615No4 {

	public static void main(String[] args) {
		// 1. ����ڷκ��� �⵵�� ���� �Է¹޾�
		// ��¥�Է� : 201806
		Scanner sc = new Scanner(System.in);
		System.out.print("��� : ");
		String time = sc.nextLine();
		// System.out.println(time.substring(0 , 4));
		// System.out.println(time.substring(4));
		// System.out.println(time);
		int year = Integer.parseInt(time.substring(0, 4));
		int month = Integer.parseInt(time.substring(4));

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(year, month - 1, 1);
//		c2.set(year, month - 1, -1);

		int tabCnt = c1.get(Calendar.DAY_OF_WEEK);
		c1.set(year, month, 1); // +1��
		c1.add(Calendar.DATE, -1); // -1��
//		System.out.println("���� : " + c1.get(Calendar.DAY_OF_WEEK));
		int lastDay = c1.get(Calendar.DATE);
		// 2. ����Ͻú��ʸ� ���
		// 2018 06 01 00 00 00
		// System.out.println(year + month + "01 00 00 00");
		System.out.println("\t\t\t" + year + "�� " + month + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		int num = 0;

		for (int i = 1; i < tabCnt; i++) {
			num++;
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDay; i++) {
			num++;
			System.out.print(i + "\t");
			if (num % 7 == 0) {
				System.out.println();
			}
		}

	}
}
