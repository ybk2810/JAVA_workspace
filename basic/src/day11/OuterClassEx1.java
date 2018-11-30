package day11;

public class OuterClassEx1 {
	// �������
	private int a = 10;// �ν��Ͻ�����
	static int b = 20;
	static final int C = 30;
	
	// private�� �������� �ٸ� Ŭ�������� ������ ���� ����. 
	// �ݵ�� �����ؾ� �Ѵٸ� inner Class
	class InnerClass{
		int d = 40;
		// static int e = 50; // inner �ȿ� static �ü�����.
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
		// System.out.println(OuterClassEx1.a); //���� ��������� ������ �ν��Ͻ�ȭ�ؾ� ��밡���� ���� 
//		System.out.println(OuterClassEx1.b);
//		System.out.println(OuterClassEx1.C);
	}
} // OuterClass end
