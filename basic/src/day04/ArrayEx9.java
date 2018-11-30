package day04;

public class ArrayEx9 {
	public static void main(String[] args) {
		// 1
		int[][] n = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		// 콘솔에 출력
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.println(n[i][j]);
			}
		}
		
		System.out.println("---------------");
		// 2
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 15 }, };
		// 콘솔에 출력
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println(m[i][j]);
			}
		}
	}
}
