package day05;

public class MethodEx6 {

	// 위키페디아 에서 복사 붙여넣기
	static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] m = { 4, 2, 5, 6, 1, 4, 6, 7 };

		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();
		System.out.println("----------");
		bubbleSort(m);
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();
	}
}
