package day06;
//Hw0607No8
public class ������ũTestMain {
	static void status(int a) {
		System.out.println("---------------");
		System.out.println("ü��: " + a);
	}
	
	public static void main(String[] args) {
		������ũ tank = new ������ũ(10);
		���� marine = new ����(8);
		
		status(tank.hp);
		status(marine.hp);
		tank.�����ϱ�(marine);
		status(tank.hp);
		status(marine.hp);
		marine.�����ϱ�(tank);
		status(tank.hp);
		status(marine.hp);
	}
}
