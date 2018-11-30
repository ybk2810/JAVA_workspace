package day02;

import java.util.Scanner;

public class Hw0531No8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char en;
		System.out.print("입력 :");
		int num = scan.nextInt();
		System.out.println();
		
		if(num % 10 == 2 || num % 10 == 4 || num % 10 == 5 || num % 10 == 9)
			en = '는';
		else
			en = '은';
		
		
		if(num % 3 == 0)
			System.out.println(num + "" + en + " 3의 배수입니다.");
		else
			System.out.println(num + "" + en + " 3의 배수가 아닙니다.");
		
		
		scan.close();
	}

}

//1		ㅇ
//2		ㄴ
//3		ㅇ
//4		ㄴ
//5		ㄴ
//6		ㅇ
//7		ㅇ
//8		ㅇ
//9		ㄴ
//10	ㅇ
//
//
//
