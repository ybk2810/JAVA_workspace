package day05;

public class MethodEx5 {
	static void setZeroData(int[] n) {
		n[1] = 0;
		System.out.println("method n[1]: " + n[1]);
	}

	public static void main(String[] args) {
		int[] m = { 300, 100, 200 };

		System.out.println("m: " + m);// ÂüÁ¶°ª
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();

		setZeroData(m);
		System.out.println("-----after-----");

		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}

	}// main method end
}// class end
