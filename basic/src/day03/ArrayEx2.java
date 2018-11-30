package day03;

public class ArrayEx2 {

	public static void main(String[] args) {

		int[] a = new int[100];

		for (int i = 0; i < 100; i++) {
			a[i] = 10 * (i + 1);
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}

}

