package day03;

import java.io.IOException;

//1. ����ڷκ��� ���� 1�ڸ� �Է¹޾�
//2. �빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� ��ȯ 65 90  97 122
//3. ��ȯ�� ���� ���

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
