package day11;

import java.util.Calendar;
import java.util.Scanner;

import day10.Cal;

public class Hw0615No4 {

	public static void main(String[] args) {
		// 1. 사용자로부터 년도의 월을 입력받아
		// 날짜입력 : 201806
		Scanner sc = new Scanner(System.in);
		System.out.print("몇년 : ");
		String time = sc.nextLine();
		// System.out.println(time.substring(0 , 4));
		// System.out.println(time.substring(4));
		// System.out.println(time);
		int year = Integer.parseInt(time.substring(0, 4));
		int month = Integer.parseInt(time.substring(4));

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(year, month - 1, 1);
//		c2.set(year, month - 1, -1);

		int tabCnt = c1.get(Calendar.DAY_OF_WEEK);
		c1.set(year, month, 1); // +1달
		c1.add(Calendar.DATE, -1); // -1일
//		System.out.println("말일 : " + c1.get(Calendar.DAY_OF_WEEK));
		int lastDay = c1.get(Calendar.DATE);
		// 2. 년월일시분초를 출력
		// 2018 06 01 00 00 00
		// System.out.println(year + month + "01 00 00 00");
		System.out.println("\t\t\t" + year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int num = 0;

		for (int i = 1; i < tabCnt; i++) {
			num++;
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDay; i++) {
			num++;
			System.out.print(i + "\t");
			if (num % 7 == 0) {
				System.out.println();
			}
		}

	}
}
