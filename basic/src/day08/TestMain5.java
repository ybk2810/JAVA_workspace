package day08;

import java.util.Scanner;

public class TestMain5 {
	public static void main(String[] args) {
		// System s = new System();
		System.out.println("�������: ");
		Scanner sc = new Scanner(System.in);
		String birth = sc.next();
		String year = birth.substring(0,2);
		String month = birth.substring(2,4);
		String day = birth.substring(4);
		
		System.out.println(year+"�� "+month+"�� "+day+"�� ���̱���");
		System.out.printf("%s�� %s�� %s�� ���̱���", year, month, day);
		
		System.gc();// garbage collector ȣ��
		
		System.exit(0);// ��������
		//0�̿��� ���� ������ ����
		
		System.exit(-100);
	}
	
}
