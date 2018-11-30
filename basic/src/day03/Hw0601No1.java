package day03;

public class Hw0601No1 {

	public static void main(String[] args) {

		int[] b = new int[20];
		
		for(int i = 0 ; i < b.length; i  ++){
			b[i] = 2 * i + 1;
			System.out.println(b[i]);
		}
		
		System.out.println(b);
	}
}
//		stack							heap
//	b [I@7852e922 		[I@7852e922 b / 1/ 3/...  / 37/ 39/