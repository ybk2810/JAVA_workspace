package day01;

public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1 = 10; // 0000 1010
		int b2 = 14; // 0000 1110
		
		System.out.println("b1 & b2 : " + (b1 & b2));
		System.out.println("b1 | b2 : " + (b1 | b2));
		
		byte b3 = 22;// 0001 0110
		byte b4 = 10;// 0000 1010
		
		System.out.println("b3 & b4 : " + (b3 & b4));// 0000 0010 2
		System.out.println("b3 | b4 : " + (b3 | b4));// 0001 1110 30
		
	}

}
