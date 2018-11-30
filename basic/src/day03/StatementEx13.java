package day03;

public class StatementEx13 {

	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 ) continue;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		
	}

}
