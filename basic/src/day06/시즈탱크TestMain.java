package day06;
//Hw0607No8
public class 시즈탱크TestMain {
	static void status(int a) {
		System.out.println("---------------");
		System.out.println("체력: " + a);
	}
	
	public static void main(String[] args) {
		시즈탱크 tank = new 시즈탱크(10);
		마린 marine = new 마린(8);
		
		status(tank.hp);
		status(marine.hp);
		tank.공격하기(marine);
		status(tank.hp);
		status(marine.hp);
		marine.공격하기(tank);
		status(tank.hp);
		status(marine.hp);
	}
}
