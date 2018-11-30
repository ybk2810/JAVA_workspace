package day04;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10);
		}
		System.out.println(num[0] + "" + num[1] + "" + num[2]);

		int count = 0;
		while (true) {
			count++;
			//int n1, n2, n3;
			Scanner scan = new Scanner(System.in);
			System.out.print("Select an integer(0~9) : ");
			int value = scan.nextInt();
			// n1 = scan.nextInt();
			// System.out.println();
			// System.out.print("Select an integer(0~9) : ");
			// n2 = scan.nextInt();
			// System.out.print("Select an integer(0~9) : ");
			// n3 = scan.nextInt();
			// int[] num2 = { n1, n2, n3 };
			int[] num2 = new int[3];
			num2[0] = value / 100;
			num2[1] = value % 100 / 10;
			num2[2] = value % 10;

			int ball = 0;
			int strite = 0;
			int clock2 = 0;
			for (int i = 0; i < num.length; i++) {
				for (int j = i; j < num2.length; j++) {
					if (num[i] == num2[j]) {

						if (i == j) {
							strite += 1;
							clock2 = 1;
						} else {
							ball += 1;
							if (clock2 == 1) {
								ball -= 1;
								clock2 = 0;
							}
						}
					}

				}
			}
			System.out.println(strite + "Strite, " + ball + "ball");
			if (strite == 3) {
				System.out.println(count+"ȸ");
				break;
				
			}
			scan.close();
		}
	}
}
