package day05;

public class TestMain4 {
	public static void main(String[] args) throws InterruptedException {
		���� m1 = new ����();

		System.out.println(m1.hp);
		System.out.println(m1.���ݷ�);
		System.out.println(m1.����);

		m1.�����ϱ�();
		m1.status();
		for (int i = 0; i <= 100; i++) {
			Thread.sleep(100);
			m1.������();
		}
		m1.status();

	}
}
