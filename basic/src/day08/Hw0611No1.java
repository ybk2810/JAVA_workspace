package day08;
import java.util.Scanner;

public class Hw0611No1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�ֹι�ȣ �Է�: ");
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
			gender = "����";
		}else {
			gender = "��";
		}
		
		System.out.println(birthYear+"�� "+birthMonth+"�� "+birthDay+"�� "+gender+"�̽ó׿�.");
	}
}