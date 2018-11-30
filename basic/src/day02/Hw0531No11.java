package day02;

import java.util.Scanner;

public class Hw0531No11 {
//시간변환기
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			System.out.print("몇초? ");
			int seconds = scan.nextInt();
			
			System.out.print(seconds/3600 + "시간 ");
			seconds %= 3600;
			System.out.print(seconds/60 + "분 ");
			seconds %= 60;
			System.out.print(seconds + "초 ");
			
			scan.close();
			
	}

}
