package day12;

public class ExceptionEx3 {
	static int plus(String a, String b) {
		int x = 0;
		int y = 0;
		int res = 0;
		x = Integer.parseInt(a);
		y = Integer.parseInt(b);
		res = x + y;
		return res;
	}

	public static void main(String[] args) {
		String a = "300";
		String b = "x";
		try {
			System.out.println(plus(a,b));
		}catch(NumberFormatException nfe) {
			System.out.println("main에서 예외처리");
		}
	}
}
