package day07;

public class 고래 extends 포유류 {
	고래() {
		눈 = 2;
		코 = 1;
		입 = 1;
		꼬리 = 1;
	}

	public void 헤엄치기() {
		System.out.println("첨벙첨벙~~~");
	}
	@Override
	public void 먹기() {
		System.out.println("새우를 먹어요....");
	}
	@Override
	public void 자기() {
		System.out.println("바다에 누워 자요~~");
	}
}
