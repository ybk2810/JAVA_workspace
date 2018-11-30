package day07;

public class TestMain4 {
	public static void main(String[] args) {
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		// 마린 m3 = new 마린();
		메딕 me = new 메딕();
		시즈탱크 st = new 시즈탱크();

		m2.status();
		m1.공격하기(m2);
		m2.status();
		System.out.println("---------------------");

		// 시즈탱크에서 마린 공격?
		st.공격하기(m2);
		m2.status();
		System.out.println("---------------------");

		m2.공격하기(st);
		st.status();
		System.out.println("---------------------");

		m2.공격하기(me);
		me.status();
		System.out.println("---------------------");

	}
}
