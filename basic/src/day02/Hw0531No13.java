package day02;

import java.util.Scanner;

public class Hw0531No13 {
//�ð���ȯ��
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.print("�����Է� :");
			int year = scan.nextInt();
			
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.println(year + "���� �����Դϴ�.");
					}
					else
						System.out.println(year + "���� ������ �ƴմϴ�.");
				}
				else
					System.out.println(year + "���� �����Դϴ�.");
			}
					
			scan.close();
//			System.out.println(year + "���� �����Դϴ�.");
//			System.out.println(year + "���� ������ �ƴմϴ�.");
	}

}
