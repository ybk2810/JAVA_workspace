package day04;

public class MethodEx1 {
	// ����
	// method, �Լ�, function
	
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
	
	//������ 3��
	static void printGuGuDan(int f, int s) {
		for(int i=1;i<=f;i++) {
			for(int j=1;j<=s;j++) {
			System.out.println(
					i + " * "+ j +" = " + i*j);
			}
		}
	}
	
	//1���� 100������ ������ ���� ���
	static void printSumValue(int num){
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("�հ�: " + sum);
	}
	
	
	
	public static void main(String[] args) {
		printStar(5);
		printStar(7);
		printGuGuDan(3,9);
		printSumValue(100);
		
		
		
		
	}
}
