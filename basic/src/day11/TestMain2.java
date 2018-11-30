package day11;

import java.util.Calendar;
import java.util.Scanner;

public class TestMain2 {
	public static void main(String[] args) {
		// 사용자로부터 년도의월으 입력받아 년월일시분초를 출력
		// 날짜 입력: 201801
		System.out.print("입력: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int year = Integer.parseInt(str.substring(0, 4));
		int month = Integer.parseInt(str.substring(4, 6));
//		int day = Integer.parseInt(str.substring(6, 8));
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		
		int startDayOfWeek = sDay.get(Calendar.DAY_OF_WEEK);
		int endDay = eDay.get(Calendar.DATE);
		System.out.println(startDayOfWeek);

		System.out.println("      " + year + "년 " + (month) + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i=1; i < startDayOfWeek; i++) {
            System.out.print("   ");
        }
		
		for(int i=1, n=startDayOfWeek ; i <= endDay; i++, n++) {
            System.out.print((i < 10)? "  "+i : " "+i );
            if(n%7==0) System.out.println();
        }
	}
}
