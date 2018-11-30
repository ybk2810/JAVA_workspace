package day05;
// Over Loading 
// methodname, 매개변수의 갯수, 자료형, 순서
public class MethodEx3 {

	static void add(int a, int b) {
		// 매개변수 ==> 지역변수
		int sum = a + b;
		System.out.println("result: " + sum);
	}// add(int, int) method end

	static void add(int a, float b) {
		int sum = (int) (a + b);
		System.out.println("result: " + sum);
	}

	static void add(float a, int b) {
		int sum = (int) (a + b);
		System.out.println("result: " + sum);
	}

	// static int sum(int a, int b, int c) {
	// int sum = (int) (a + b + c);
	// System.out.println("result: " + sum);
	// }
	//
	// static int sum(int a, int b, int c, int d, int e) {
	// int sum = (int) (a + b + c + d + e);
	// System.out.println("result: " + sum);
	// }

	// 가변인수
	static int sum(int... args) {
		int v = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "\t");
			v += args[i];
		}
		return v;
	}

	public static void main(String[] args) {
		add(100, 200); // 두 수의 합을 출력

		add(100, 200.0f); // 두 수의 합을 출력

		add(100.0f, 200);

		// Method Overloading
		// 방법? methodname 동일
		// 매개변수의 개수, 자료형, 순서를 다르게 할 수 있다.
		System.out.println(300);
		System.out.println("메서드테스트");
		System.out.println(200.0f);
		System.out.println(500.0f);
		System.out.println(true);

		System.out.println("--------------");
		int v = sum(100, 200, 400);
		System.out.println(v);

		int v2 = sum(100, 200, 400, 500, 700);
		System.out.println(v2);

		int v3 = sum(100, 200, 400, 500, 700, 800, 900, 100, 200, 3000, 40900);
		System.out.println(v3);
	}
}
