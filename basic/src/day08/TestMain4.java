package day08;

import java.util.Scanner;

public class TestMain4 {
	public static void main(String[] args) {
		System.out.print("친구들아이디입력(,로 구분): ");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		
		System.out.println("data: " + data);
		
		//친구들 아이디 출력
		
		String[] idList = data.split(",");
		
		//향상된 for문 사용해서 id 출력
		for(String x : idList) {
			System.out.println(x);
		}
		
	}
}
