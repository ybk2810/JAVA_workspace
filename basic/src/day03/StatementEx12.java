package day03;

public class StatementEx12 {

	public static void main(String[] args) {

		outer:
		for (int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j ++) {
				if(i == j)
					continue outer;
				System.out.println("i : " + i + ", j : " + j);
			}
		}
	}
	//i : 1, j : 1
	//i : 1, j : 2
	//i : 1, j : 3
	//i : 1, j : 4
	//i : 2, j : 1
	//i : 2, j : 2
	//i : 2, j : 3
	//i : 2, j : 4
	//i : 3, j : 1
	//i : 3, j : 2
	//i : 3, j : 3
	//i : 3, j : 4
	//i : 4, j : 1
	//i : 4, j : 2
	//i : 4, j : 3
	//i : 4, j : 4
}
