package day12;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. ERROR: ġ���� ����
		// 2. EXCEPTION: ������ ����
		//	1. try ~~ catch
		//	2. ���� ����
		
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
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e){
			System.out.println("���� ���� ����");
			e.printStackTrace();
			// ���� ���� �����ؼ� ���
		}
		
		
		
	}
}
