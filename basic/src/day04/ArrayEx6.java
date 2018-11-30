package day04;

//import java.util.Random;

public class ArrayEx6 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 };

		// 0부터 9사이의 랜덤값 10를 출력
		// Random random = new Random();
		// int randomInt01 = random.nextInt();
		// System.out.println("rancomInt01 \t: " + randomInt01);

		for (int i = 1; i <= 1000; i++) {
			int a = (int) (Math.random() * 45);
			int b = (int) (Math.random() * 45);
			while (a == b) {
				b = (int) (Math.random() * 45);
			}
			// System.out.println("num[" + a + "]: " + num[a]);
			// System.out.println("num[" + b + "]: " + num[b]);

			int buf;
			buf = num[a];
			num[a] = num[b];
			num[b] = buf;

			// System.out.println("num[" + a + "]: " + num[a]);
			// System.out.println("num[" + b + "]: " + num[b]);
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(num[i] + "\t");
		}
//		for (int i = 0; i < 8; i++) {
//			for (int i = 0; i < 8; i++) {
//		}
	}
}
