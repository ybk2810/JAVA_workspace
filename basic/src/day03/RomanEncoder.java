package day03;

import java.io.IOException;

public class RomanEncoder {

	public static void main(String[] args) throws IOException{

		System.out.print("Insert your letter :");
		char input = (char)System.in.read();
		
		input += 3;
		if((input > 90 && input < 94) || (input > 122 && input < 126))
			input -= 26;
		
		System.out.print("Your encoded letter is :");
		System.out.print(input);
	}

}
