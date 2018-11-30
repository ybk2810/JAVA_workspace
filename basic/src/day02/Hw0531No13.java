package day02;

import java.util.Scanner;

public class Hw0531No13 {
//시간변환기
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.print("연도입력 :");
			int year = scan.nextInt();
			
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.println(year + "년은 윤년입니다.");
					}
					else
						System.out.println(year + "년은 윤년이 아닙니다.");
				}
				else
					System.out.println(year + "년은 윤년입니다.");
			}
					
			scan.close();
//			System.out.println(year + "년은 윤년입니다.");
//			System.out.println(year + "년은 윤년이 아닙니다.");
	}

}
