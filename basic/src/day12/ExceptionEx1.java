package day12;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. ERROR: 치명적 오류
		// 2. EXCEPTION: 가벼운 오류
		//	1. try ~~ catch
		//	2. 예외 전가
		
		int a = 21;
		Random rnd = new Random();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			for(int i = 0; i<100; i++) {
				int b = rnd.nextInt(5);
				System.out.println(a/b);
			}
		}catch(ArithmeticException ae){
			System.out.println("0으로 나울 수 없습니다.");
		}catch(Exception e){
			System.out.println("나도 몰러 예외");
			e.printStackTrace();
			// 현재 스택 추적해서 출력
		}
		
		
		
	}
}
