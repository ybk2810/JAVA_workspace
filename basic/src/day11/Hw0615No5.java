package day11;

import java.util.Scanner;

public class Hw0615No5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ 13�ڸ��� '-'���� �Է��ϼ��� : ");
		String jumin = sc.nextLine();
		
		String check = "234567892345";
		
		int sum = 0;
		for(int i = 0; i < 12; i++) {
			sum += (jumin.charAt(i) - 48) * (check.charAt(i) - '0');
		}
		
		sum = sum % 11;
		sum = 11 - sum;
		sum = sum % 10;
		if(sum == jumin.codePointAt(12)-48) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}
}