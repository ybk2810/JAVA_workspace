package day08;

import java.util.Scanner;

public class TestMain4 {
	public static void main(String[] args) {
		System.out.print("ģ������̵��Է�(,�� ����): ");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		
		System.out.println("data: " + data);
		
		//ģ���� ���̵� ���
		
		String[] idList = data.split(",");
		
		//���� for�� ����ؼ� id ���
		for(String x : idList) {
			System.out.println(x);
		}
		
	}
}
