package day02;

import java.util.Scanner;

public class Hw0531No8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char en;
		System.out.print("�Է� :");
		int num = scan.nextInt();
		System.out.println();
		
		if(num % 10 == 2 || num % 10 == 4 || num % 10 == 5 || num % 10 == 9)
			en = '��';
		else
			en = '��';
		
		
		if(num % 3 == 0)
			System.out.println(num + "" + en + " 3�� ����Դϴ�.");
		else
			System.out.println(num + "" + en + " 3�� ����� �ƴմϴ�.");
		
		
		scan.close();
	}

}

//1		��
//2		��
//3		��
//4		��
//5		��
//6		��
//7		��
//8		��
//9		��
//10	��
//
//
//
