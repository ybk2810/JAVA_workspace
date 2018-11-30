package day04;

public class ArrayEx7 {
	public static void main(String[] args) {
		// 2차원 배열
		int[][] k = new int[3][2];

		System.out.println("k: " + k);
		System.out.println("k[0]: " + k[0]);
		System.out.println("k[0][0]: " + k[0][0]);
		System.out.println("k.length: " + k.length);
		System.out.println("k[0].length: " + k[0].length);

		// 2차원 배열 채워 놓기
		// 10 20
		// 30 40
		// 50 60

		// k[0][0] = 10;
		// k[0][1] = 20;
		// k[1][0] = 30;
		// k[1][1] = 40;
		// k[2][0] = 50;
		// k[2][1] = 60;

		// int [][] k = {
		// {10,20},
		// {30,40},
		// {50,60}
		// };

		int value = 0;
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				value += 10;
				k[i][j] = value;
				System.out.println(k[i][j]);
			}
		}

	}
}
