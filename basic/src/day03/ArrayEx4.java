package day03;

public class ArrayEx4 {

	public static void main(String[] args) {

		int[] m = new int[5];
		int[] n = new int[5];
		int[] k = new int[5];

		for (int i = 0; i < m.length; i++) {
			m[i] = 2 * i;
			n[i] = 2 * i + 1;
			k[i] = m[i] + n[i];
		}

		for (int i = 0; i < m.length; i++)
			System.out.println("m[" + i + "] : " + m[i] + 
							"\tn[" + i + "] : " + n[i] + 
							"\tk[" + i + "] : " + k[i]);

	}

}
