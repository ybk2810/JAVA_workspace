package day03;

import java.io.IOException;

//1. 사용자로부터 문자 1자를 입력받아
//2. 대문자를 소문자로, 소문자를 대문자로 변환 65 90  97 122
//3. 변환된 값을 출력

public class CaseConverter {

	public static void main(String[] args) throws IOException{
		
		System.out.print("Type in an alphabet to convert : ");
		char input = (char)System.in.read();
		
		System.out.print("Converted alphabet : ");
		if(input >= 65 && input <= 90) {
			input += 32;
			System.out.println(input);
		}else if(input >= 97 && input <= 122) {
			input -= 32;
			System.out.println(input);
		}else
			System.out.println("Wrong input");
			
		
	}

}
