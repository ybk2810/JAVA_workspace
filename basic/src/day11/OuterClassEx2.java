package day11;

public class OuterClassEx2 {
	private int a = 10;// �ν��Ͻ�����
	static int b = 20;
	static final int C = 30;
	static class StaticInnerClass{
		int d = 40;
		static int e = 50; // inner �ȿ� static �ü�����.
		static final int F = 60;
		public void print() {
//			System.out.println("a: "+a);
			System.out.println("b: "+b);
			System.out.println("C: "+C);
			System.out.println("d: "+d);
			System.out.println("e: "+e);
			System.out.println("F: "+F);
		}
	} //StaticInnerClass
	
	public static void main(String[] args) {
//		System.out.println(OuterClassEx2.b);
		StaticInnerClass sic = new StaticInnerClass();
		sic.print();
	} // main methoc end
} // OuterClassEx end
