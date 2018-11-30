package day05;

public class Hw0605No1 {
	static int[][] addArray(int[][] m, int[][] n) {
		int[][] c = new int[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				c[i][j] = m[i][j] + n[i][j];
			}
		}
		return c;
	}

	static void SOP(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] m = { { 3, 2, 3 }, { 4, 5, 6 }, { 1, 4, 9 } };
		System.out.println("m 배열");
		SOP(m);

		int[][] n = { { 1, 8, 7 }, { 6, 4, 4 }, { 3, 2, 3 } };
		System.out.println("n 배열");
		SOP(n);

		int c[][] = addArray(m, n);
		System.out.println("c 배열");
		SOP(c);

	}

}
