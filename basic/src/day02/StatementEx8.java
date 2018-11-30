package day02;

import java.io.IOException;

public class StatementEx8 {
	public static void main(String[] args) throws IOException  {
		
		System.out.print("Insert Value :");
		int value = System.in.read() - 48;
		System.out.println();
		
		for(int i = 1; i <= 9; i++)
			System.out.println(value + " * " + i + " = " + value * i	);
	}

}

