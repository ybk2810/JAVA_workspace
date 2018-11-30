package day12;

import java.util.Random;

public class ExceptionEx4 {
	public static void main(String[] args) {
		int num[] = new int[3];
		Random rnd  = new Random();
		int index = rnd.nextInt(10);
		try {
			num[index] = rnd.nextInt(500);
			System.out.println("index : " + index 
					+ "num[ " + index + "] : "
					+num[index]);
		}catch(Exception e){
			System.out.println("index : " + index 
					+ "num[ " + index + "] : 존재하지 않습니다.");
			e.printStackTrace();
		}
	}
}
