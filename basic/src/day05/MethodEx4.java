package day05;

// Method 호출방식에 따른 분류
//	call by name
//	call by value
//	call by reference
public class MethodEx4 {
	static void add(int a, int b) {
		a++;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		add(a, b);

	}
}
