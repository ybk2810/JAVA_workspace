package day04;

// VendingMachine
// 1. 사용자로부터 숫자를 입력받는다. 동전을 입력하세요: 50000
// 	1.콜라 1200
// 	2.사이다 1600
// 	3.맥주 2500
// 2.메뉴를 선택하세요: 2
// 3.몇개?: 3
// 사이다 3개 잔돈 계산 45200원
// 만원 4장, 5오천원 1장 백원 2개
import java.util.Scanner;

public class Hw0604No1 {
	public static void main(String[] args) {
		System.out.print("돈은 입금하세요: ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.println("1.콜라: 1200원");
		System.out.println("2.사이다: 1600원");
		System.out.println("3.맥주: 2500원");
		System.out.print("메뉴를 고르세요:");
		int order_menu = sc.nextInt();

		System.out.print("수량: ");
		int order_amount = sc.nextInt();

		String[] name = { "콜라", "사이다", "맥주" };
		System.out.println(name[order_menu - 1] + order_amount + "개");

		int[] menu = { 1200, 1600, 2500 };
		int change = money - (menu[order_menu - 1] * order_amount);
		System.out.println("잔돈: " + change + "원입니다.");

		int ocheon = 0;
		int cheon = 0;
		int obeak = 0;
		int beak = 0;

		ocheon = change / 5000;
		cheon = change % 5000 / 1000;
		obeak = change % 5000 % 1000 / 500;
		beak = change % 5000 % 1000 % 500 / 100;

		if (ocheon != 0)
			System.out.println("오천원 : " + ocheon);
		if (cheon != 0)
			System.out.println("천원 : " + cheon);
		if (obeak != 0)
			System.out.println("오백원 : " + obeak);
		if (beak != 0)
			System.out.println("백원 : " + beak);
		sc.close();
	}
}
