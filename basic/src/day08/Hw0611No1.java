package day08;
import java.util.Scanner;

public class Hw0611No1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("주민번호 입력: ");
		String number = scan.nextLine();
		
		String birthYear = number.substring(0,2);
		String birthMonth = number.substring(2,4);
		String birthDay = number.substring(4,6);
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDay);
		
		String gender;
		
		char[] ch1 = number.substring(7,8).toCharArray();
		System.out.println(ch1[0]);
		
		if(ch1[0]=='1') {
			gender = "남성";
		}else {
			gender = "여";
		}
		
		System.out.println(birthYear+"년 "+birthMonth+"월 "+birthDay+"일 "+gender+"이시네요.");
	}
}