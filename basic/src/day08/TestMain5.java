package day08;

import java.util.Scanner;

public class TestMain5 {
	public static void main(String[] args) {
		// System s = new System();
		System.out.println("생년월일: ");
		Scanner sc = new Scanner(System.in);
		String birth = sc.next();
		String year = birth.substring(0,2);
		String month = birth.substring(2,4);
		String day = birth.substring(4);
		
		System.out.println(year+"년 "+month+"월 "+day+"일 생이군요");
		System.out.printf("%s년 %s월 %s일 생이군요", year, month, day);
		
		System.gc();// garbage collector 호출
		
		System.exit(0);// 정상종료
		//0이외의 값은 비정상 종료
		
		System.exit(-100);
	}
	
}
