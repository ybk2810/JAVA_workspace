package day11;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		Random rnd = new Random();
		for(int i = 0; i<100; i++) {
			int k = rnd.nextInt(45);
			System.out.println(k);
		}
		
	}
}
