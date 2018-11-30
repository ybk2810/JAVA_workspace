package day12;

public class ExceptionEx2 {
	static int plus(String a, String b) {
		int c = 0;
		int d = 0;
		int e = 0;
		
		try {
			c = Integer.parseInt(a);
			d = Integer.parseInt(b);
			e = c/d;
		}catch(NumberFormatException nfe){
			System.out.println("숫자로 변경할 수 없는 값입니다.");
		}catch(ArithmeticException ae){
			System.out.println("수학적 연산이 불가능합니다.");
		}catch(Exception e2) {
			e2.printStackTrace();
			System.out.println("나도몰라 예외발생");
			System.out.println("포기하세요");
		}finally {
			System.out.println("예외가 발생하던 하지 않던 실행되는 코드");
		}
		
		return e;
	}
	
	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		System.out.println(plus(a,b));
	}


	
}
