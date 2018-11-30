package day04;
//버블 정렬 

public class Hw0604No4 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 };

		for (int i = 1; i <= 1000; i++) {
			int a = (int) (Math.random() * 45);
			int b = (int) (Math.random() * 45);
			while (a == b) {
				b = (int) (Math.random() * 45);
			}
			int buf;
			buf = num[a];
			num[a] = num[b];
			num[b] = buf;
		}
		int[] data = new int[6];
		for (int i = 0; i < 6; i++) {
			data[i] = num[i];
			System.out.print(num[i] + "\t");
		}
		System.out.println("");
		System.out.println("------정렬전------");

		int temp;
		int cnt = 0;
		for (int i = data.length; i > 0; i--) {
			//
			for (int j = 0; j < i - 1; j++) {
				cnt++;
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		

		for (int i = 0; i < 6; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println("");
		System.out.println("------정렬후------");
	}

}
