package day02;

public class Hw0531No10 {

	public static void main(String[] args) {
		
		System.out.println("2�� �ֻ����� ������ �� \n���� 4�� �Ǵ� ��� ����� ��");
		
		for(int i = 1; i <= 6; i++)
			for(int j = 1; j <= 6; j++)
				if(j + i == 4)
					System.out.println("( " + i + " , " + j + " )");
		
	}
}
