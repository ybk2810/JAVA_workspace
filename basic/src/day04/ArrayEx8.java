package day04;
// ������ 3���� 2���� �迭�� ��� 

//ȭ�鿡 ��� 
//3 1 3
//3 2 6
// 3 9 27

public class ArrayEx8 {
	public static void main(String[] args) {
		int[][] k = new int[9][3];

		int value = 0;
		for (int i = 0; i < k.length; i++) {
			value += 1;
			k[i][0] = 3;
			k[i][1] = value;
			k[i][2] = 3 * value;

			for (int j = 0; j < k[i].length; j++) {
				System.out.println(k[i][j] + "\t");
			}

			System.out.println(k[i][0] + "*" + k[i][1] + "= " + k[i][2]);
		}
	}
}
