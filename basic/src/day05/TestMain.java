package day05;

public class TestMain {
	public static void main(String[] args) {
		Car c;
		c = new Car(); // �ν��Ͻ�ȭ
		System.out.println("c: " + c); // stack �ּ�

		// ���
		System.out.println(c.����); // stack c���� heap���� ã�ư�
		System.out.println("����: " + c.����);
		System.out.println("������: " + c.������);
		c.start();

	}
}
