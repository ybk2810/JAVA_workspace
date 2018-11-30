package day05;

public class TestMain4 {
	public static void main(String[] args) throws InterruptedException {
		마린 m1 = new 마린();

		System.out.println(m1.hp);
		System.out.println(m1.공격력);
		System.out.println(m1.방어력);

		m1.공격하기();
		m1.status();
		for (int i = 0; i <= 100; i++) {
			Thread.sleep(100);
			m1.스팀팩();
		}
		m1.status();

	}
}
