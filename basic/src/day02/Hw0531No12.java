package day02;

import java.util.Scanner;

public class Hw0531No12 {
	// �ð���ȯ��
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] div = { 50000, 10000, 5000, 1000, 500, 100, 10 };
		System.out.print("�Ա� : ");
		int money = scan.nextInt();
		char jg = '��';
		
		for (int i = 0; i < div.length; i++) {
			System.out.println(div[i] + "�� :" + money/div[i] + "" + jg);
			money %= div[i];
		}

		/*System.out.println("50000�� : " + money / 50000 + "" + jg);
		money %= 50000;
		System.out.println("10000�� : " + money / 10000 + "��");
		money %= 10000;
		System.out.println("5000�� : " + money / 5000 + "��");
		money %= 5000;
		System.out.println("1000�� : " + money / 1000 + "��");
		money %= 1000;
		System.out.println("500�� : " + money / 500 + "��");
		money %= 500;
		System.out.println("100�� : " + money / 100 + "��");
		money %= 100;
		System.out.println("10�� : " + money / 10 + "��");
		money %= 10;*/

		scan.close();
	}

}
