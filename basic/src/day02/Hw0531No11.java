package day02;

import java.util.Scanner;

public class Hw0531No11 {
//�ð���ȯ��
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			System.out.print("����? ");
			int seconds = scan.nextInt();
			
			System.out.print(seconds/3600 + "�ð� ");
			seconds %= 3600;
			System.out.print(seconds/60 + "�� ");
			seconds %= 60;
			System.out.print(seconds + "�� ");
			
			scan.close();
			
	}

}
