package day11;

import java.util.Calendar;

public class Hw0615No2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(
				year + "년 " + (month + 1) + "월 " + date + "일 " + hourOfDay + "시 " + minute + "분 " + second + "초 ");

	}
}
