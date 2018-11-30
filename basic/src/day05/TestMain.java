package day05;

public class TestMain {
	public static void main(String[] args) {
		Car c;
		c = new Car(); // 인스턴스화
		System.out.println("c: " + c); // stack 주소

		// 사용
		System.out.println(c.바퀴); // stack c에서 heap으로 찾아감
		System.out.println("바퀴: " + c.바퀴);
		System.out.println("제조사: " + c.제조사);
		c.start();

	}
}
