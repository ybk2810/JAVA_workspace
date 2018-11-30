package day11;

public class TestMain {
	public static void main(String[] args) {
		Gun g = new Gun();
		TaserGun t = new TaserGun();
		Police p = new Police(g);
//		p.setWeapon(t);// setter, 다른 무기로 교체
		

		Police p2 = new Police(t);

		p.fire();

		p.도너츠먹기();
		p.무기사용();
		System.out.println("---------------------");
		p2.무기사용();
		p2.도너츠먹기();
		//
		// g.fire();
		// g.reload();
		// System.out.println(p.bullet);
	}
}
