package day11;
import java.util.*;

public class Hw0615No3 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.print("몇년 : ");
		int year = scan.nextInt();
		System.out.print("몇월 : ");
		int month = scan.nextInt();
		System.out.println();
		int date = 0;

		int allDay = 0;
		int monthDay[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String dow[] = { " 일", " 월", " 화", " 수", " 목", " 금", " 토" };

		for (int i = 1; i < year; i++) {
			if ((i % 4 == 0 && i % 100 != 100) || i % 400 == 0)
				allDay += 366;
			else
				allDay += 365;
		}

		for (int i = 1; i < month; i++) {
			if (i == 2) {
				if ((i % 4 == 0 && i % 100 != 100) || i % 400 == 0)
					allDay += 29;
				else
					allDay += 28;
			} else
				allDay += monthDay[i - 1];
		}

		int dayofweek = allDay % 7;

		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 100) || year % 400 == 0)
				date = monthDay[1] + 1;
			else
				date = monthDay[1];
		} else {
			date = monthDay[month - 1];
		}

		for (int i = 0; i < dow.length; i++) {
			System.out.print(i == 7 ? "" : "\t");
			System.out.print(dow[i]);
		}
		System.out.println();

		for (int i = 0; i < dayofweek; i++) {
			System.out.print("\t ");
		}

		int n = dayofweek;
		for (int i = 1; i <= date; i++) {
			System.out.printf("\t%2d", i);
			n++;
			if (n == 7) {
				n = 0;
				System.out.println();
			}
		}
	}
}


