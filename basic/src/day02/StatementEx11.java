package day02;

import java.util.Scanner;

public class StatementEx11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your score :");
		int score = scan.nextInt();
		System.out.println();
		
		System.out.println("Your score is " + score);
		System.out.println();
		
		System.out.print("Your grade is ");
		switch(score/10)
		{
		case 10:
			System.out.print("A");
			break;
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		default:
			System.out.print("F");
			break;
		}
			
		scan.close();
	}

}
