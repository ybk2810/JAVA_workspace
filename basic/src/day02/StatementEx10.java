package day02;

import java.util.Scanner;


public class StatementEx10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("����? ");
		int year = scan.nextInt();
		int tzs = year % 12;
		
		System.out.print("\n�� ");
		switch(tzs)
		{
		case 0:
			System.out.print("������");
			break;
		case 1:
			System.out.print("��");
			break;
		case 2:
			System.out.print("��");
			break;
		case 3:
			System.out.print("����");
			break;
		case 4:
			System.out.print("��");
			break;
		case 5:
			System.out.print("��");
			break;
		case 6:
			System.out.print("ȣ����");
			break;
		case 7:
			System.out.print("�䳢");
			break;
		case 8:
			System.out.print("��");
			break;
		case 9:
			System.out.print("��");
			break;
		case 10:
			System.out.print("��");
			break;
		case 11:
			System.out.print("��");
			break;
		default:
			break;
		}
		System.out.println("��");
		
		
		scan.close();
		
	}

}
