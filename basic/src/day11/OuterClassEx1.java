package day11;

public class OuterClassEx1 {
	// 멤버변수
	private int a = 10;// 인스턴스변수
	static int b = 20;
	static final int C = 30;
	
	// private한 변수까지 다른 클래스에서 접근할 수는 없다. 
	// 반드시 접근해야 한다면 inner Class
	class InnerClass{
		int d = 40;
		// static int e = 50; // inner 안에 static 올수없다.
		static final int F = 60;
		public void print() {
			System.out.println("a: "+a);
			System.out.println("b: "+b);
			System.out.println("C: "+C);
			System.out.println("d: "+d);
			// System.out.println("e: "+e);
			System.out.println("F: "+F);
		} // print() end
	} // InnerClass end
	
	public static void main(String[] args) {
		OuterClassEx1 oce1 = new OuterClassEx1();
		OuterClassEx1.InnerClass ic = oce1.new InnerClass();
		
		ic.print();
		
//		System.out.println(oce1.a);
		// System.out.println(OuterClassEx1.a); //힙에 만들어지는 변수라 인스턴스화해야 사용가능한 변수 
//		System.out.println(OuterClassEx1.b);
//		System.out.println(OuterClassEx1.C);
	}
} // OuterClass end
