package day03;

public class Ex2 {

	public static void main(String[] args) {

		int[] m = {3, 2, 5, 6, 9};
		int buf;
		
		buf = m[0];
		m[0] = m[1];
		m[1] = buf;
		
		for(int i=0; i<m.length; i++) {
			System.out.println(m[i]);
	
		}
	}
}
