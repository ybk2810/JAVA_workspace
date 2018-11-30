package day04;

public class MethodEx1 {
	// 독립
	// method, 함수, function
	
	//*
	//**
	//***
	//****
	//*****
	//******
	static void printStar(int num){
		for (int line=1;line<=num;line++) {
			for (int star=1;star<=line;star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//구구단 3단
	static void printGuGuDan(int f, int s) {
		for(int i=1;i<=f;i++) {
			for(int j=1;j<=s;j++) {
			System.out.println(
					i + " * "+ j +" = " + i*j);
			}
		}
	}
	
	//1부터 100까지의 숫자의 합을 출력
	static void printSumValue(int num){
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("합계: " + sum);
	}
	
	
	
	public static void main(String[] args) {
		printStar(5);
		printStar(7);
		printGuGuDan(3,9);
		printSumValue(100);
		
		
		
		
	}
}
