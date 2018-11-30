package day02;

import java.util.Scanner;

public class Hw0531No12 {
	// 시간변환기
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] div = { 50000, 10000, 5000, 1000, 500, 100, 10 };
		System.out.print("입금 : ");
		int money = scan.nextInt();
		char jg = '장';
		
		for (int i = 0; i < div.length; i++) {
			System.out.println(div[i] + "권 :" + money/div[i] + "" + jg);
			money %= div[i];
		}

		/*System.out.println("50000권 : " + money / 50000 + "" + jg);
		money %= 50000;
		System.out.println("10000권 : " + money / 10000 + "장");
		money %= 10000;
		System.out.println("5000권 : " + money / 5000 + "장");
		money %= 5000;
		System.out.println("1000권 : " + money / 1000 + "장");
		money %= 1000;
		System.out.println("500권 : " + money / 500 + "개");
		money %= 500;
		System.out.println("100권 : " + money / 100 + "개");
		money %= 100;
		System.out.println("10권 : " + money / 10 + "개");
		money %= 10;*/

		scan.close();
	}

}
