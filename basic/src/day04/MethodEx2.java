package day04;

public class MethodEx2 {
	static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

	// void: �ƹ��͵� ��ȯ�� �ʿ����
	// ��ȯ�� ���� �ڷ��� :
	
	static int add2(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		return sum;
		// �� ������ �ڵ������� ���޽���
	}

	static int minus(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		return result;
	}
	
	static int multi(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		return result;
	}
	
	static int divide(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		return result;
	}

	public static void main(String[] args) {
		int value = add2(100, 200);
		System.out.println("value: " + value);

		int value2 = minus(200, 100);
		System.out.println("value2: " + value2);
		
		int value3 = multi(200, 3);
		System.out.println("value3: " + value3);
		
		int value4 = divide(200, 5);
		System.out.println("value4: " + value4);
	}
}
