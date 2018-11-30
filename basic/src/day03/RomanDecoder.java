package day03;

import java.io.IOException;

public class RomanDecoder {

	public static void main(String[] args) throws IOException{

		System.out.print("Insert your code :");
		char input = (char)System.in.read();
		
		input -= 3;
		if((input > 61 && input < 65) || (input > 93 && input < 97))
			input += 26;
		
		System.out.print("Your decoded letter is :");
		System.out.print(input);
	}

}
