package day02;

public class StatementEx99 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int k = -2; k <= 1; k++) {
					int a = 4 * i + k;
					System.out.print(a + " * " + j + " = " + a * j + "\t\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
