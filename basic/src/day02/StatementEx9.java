package day02;

import java.util.Scanner;

public class StatementEx9 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("己利涝仿 : ");
		int score = scan.nextInt();
		System.out.println();

		System.out.print("己利 : ");

		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");

		scan.close();
	}

}
