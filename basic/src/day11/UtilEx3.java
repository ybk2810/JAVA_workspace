package day11;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		cal.set(2000, 1, 1);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0������ ����
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
	
		
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(
				year+"�� "+(month+1)+"�� "+day+"�� "+hour+"�� "+min+"�� "+sec+"��");
		//
	}
}
