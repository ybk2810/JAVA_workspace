package day11;

public class OuterClassEx3 {
	private int a = 10;
	static int b = 20;
	static final int C = 30;
	public void printAll() {
		// 지역변수 처럼 inner class
		class LocalInnerClass{
			int d = 40;
			// static int e = 50;
			static final int F = 60;
			public void print() {
				System.out.println("a: "+a);
				System.out.println("b: "+b);
				System.out.println("C: "+C);
				System.out.println("d: "+d);
				// System.out.println("e: "+e);
				System.out.println("F: "+F);
			} // print () end
			
		} // Local InnerClass end
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
	} // printAll() end
	
	public static void main(String[] args) {
		OuterClassEx3 oce3 = new OuterClassEx3();
		oce3.printAll();
	} // main() end
}
