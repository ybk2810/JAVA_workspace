package day06;

//import java.util.Arrays;

public class Hw0607No1 {
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

	static void quickSort(int[] arr, int left, int right) {
		int i, j, pivot, tmp;
		if (left < right) {
			i = left;
			j = right;
			pivot = arr[left];
			// ���� ����
			while (i < j) {
				while (arr[j] > pivot)
					j--;
				// �� �κп��� arr[j-1]�� �����ؼ� �ͼ��� �߻�������
				while (i < j && arr[i] <= pivot)
					i++;

				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			// ���� ����
			quickSort(arr, left, i - 1);
			quickSort(arr, i + 1, right);
		}
	}

	static void selectionSort(int[] list) {
		int indexMin, temp;

		for (int i = 0; i < list.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[indexMin]) {
					indexMin = j;
				}
			}
			temp = list[indexMin];
			list[indexMin] = list[i];
			list[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] data = { 200, 100, 20, 40, 503, 231 };

		// ���� ��,����...
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
		// ����
		// Arrays.sort(data);
		// for(int i=1; i<data.length; i++) {
		// System.out.print(data[i]+"\t");
		// }
		// System.out.println();
		//

		System.out.println("-----------");
		bubbleSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();

		// System.out.println("-----------");
		// quickSort(data);
		// for (int i = 0; i < data.length; i++) {
		// System.out.print(data[i] + "\t");
		// }
		// System.out.println();

		System.out.println("-----------");
		selectionSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}
}
