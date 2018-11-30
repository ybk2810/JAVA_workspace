package day07;

public abstract class 포유류  {
	int 눈, 코, 입, 귀, 꼬리;
	
	public 포유류() {
		System.out.println("Parent 클래스의 기본 생성자");
		눈 = 2;
		코 = 1;
		입 = 1;
	}
	
	// 먹기와 자기 메서드는 반드시 오버라이드 해야한다. 
	// 미완성 메서드 : method body가 없는 메서드
	// 추상메서드
	public abstract void 먹기();//instance화할수 없음 추상메서드의 특징

	public abstract void 자기();
}
