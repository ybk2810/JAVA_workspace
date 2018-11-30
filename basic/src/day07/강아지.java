package day07;

public class 강아지 extends 포유류 {
	int 귀;
	String 이름, 털, 종;

	강아지() {
		눈 = 2;
		코 = 1;
		입 = 1;
		귀 = 2;
		이름 = "콩";
		털 = "흰색";
		종 = "말티즈";
	}

	public void 짖기() {
		System.out.println("왈왈");
	}
	public void 달리기() {
		System.out.println("......");
	}
	public void 공줍기놀이() {
		System.out.println("물어와~~~");
	}
	@Override
	public void 먹기() {
		System.out.println("사료만 먹어요");
	}
	public void 자기() {
		System.out.println("옆으로 누워자요 쿨쿨");
	}

}
