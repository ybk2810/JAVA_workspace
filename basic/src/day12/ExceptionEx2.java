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
			System.out.println("���ڷ� ������ �� ���� ���Դϴ�.");
		}catch(ArithmeticException ae){
			System.out.println("������ ������ �Ұ����մϴ�.");
		}catch(Exception e2) {
			e2.printStackTrace();
			System.out.println("�������� ���ܹ߻�");
			System.out.println("�����ϼ���");
		}finally {
			System.out.println("���ܰ� �߻��ϴ� ���� �ʴ� ����Ǵ� �ڵ�");
		}
		
		return e;
	}
	
	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		System.out.println(plus(a,b));
	}


	
}
