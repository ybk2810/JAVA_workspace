package day02;

import java.util.Scanner;

public class StatementEx98 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int counter = 0;
		int n;

		while (true) {
			System.out.print("Select an integer(1~9) : ");
			n = scan.nextInt();
			System.out.println();

			if (!(n >= 10 || n < 1))
				break;
			else {
				counter++;
				if (counter > 2) {
					System.out.println("Get Lost");
					break;
				}
				System.out.println("Invalid value. Retry");
			}
		}

		for (int i = 0; i < n * 2 - 1; i++) {
			boolean cond = i < n;
			int iniJ = cond ? (n - i - 1) : -1 * (n - i - 1);
			int iniK = cond ? (2 * (i + 1) - 1) : 2 * (2 * n - i - 1) - 1;

			for (int j = 0; j < iniJ; j++)
				System.out.print(" ");

			for (int k = 0; k < iniK; k++)
				System.out.print("*");

			System.out.println();
		}
		scan.close();
	}
}