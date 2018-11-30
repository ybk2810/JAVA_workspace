package day01;

public class VarEx2 {
	public static void main(String[] args) {
		byte b = 127; //initialize
		
		long d = 4000L;

		System.out.println("b: " + b);
		System.out.println("d: " + d);
		
		int k = 120;
		byte b1 = 0;
		
		//k = b1;
		b1 = (byte)k;
		
		System.out.println(b1);
		
		float f1 = 30.2f;
		
		double d1 = 300.12d;
		double d2 = 200.2;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
	}
}
