package day07;

public class 말 extends 포유류 implements Flyable{
	
	public void 달리기() {
		System.out.println("애헤헤ㅔ헹");
	}
	
	//우클릭 Source override/implement methods
	@Override
	public void fly() {
		System.out.println("유니콘~~");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 먹기() {
		System.out.println("당근을 먹어요....");
	}
	public void 자기() {
		System.out.println("누워 자요~~");
	}
}
