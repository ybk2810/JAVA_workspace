package day02;

import java.util.Scanner;


public class StatementEx10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("¸î³â»ı? ");
		int year = scan.nextInt();
		int tzs = year % 12;
		
		System.out.print("\n³Í ");
		switch(tzs)
		{
		case 0:
			System.out.print("¿ø¼şÀÌ");
			break;
		case 1:
			System.out.print("´ß");
			break;
		case 2:
			System.out.print("°³");
			break;
		case 3:
			System.out.print("µÅÁö");
			break;
		case 4:
			System.out.print("Áã");
			break;
		case 5:
			System.out.print("¼Ò");
			break;
		case 6:
			System.out.print("È£¶ûÀÌ");
			break;
		case 7:
			System.out.print("Åä³¢");
			break;
		case 8:
			System.out.print("¿ë");
			break;
		case 9:
			System.out.print("¹ì");
			break;
		case 10:
			System.out.print("¸»");
			break;
		case 11:
			System.out.print("¾ç");
			break;
		default:
			break;
		}
		System.out.println("¶ì");
		
		
		scan.close();
		
	}

}
