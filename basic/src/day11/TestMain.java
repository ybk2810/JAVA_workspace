package day11;

public class TestMain {
	public static void main(String[] args) {
		Gun g = new Gun();
		TaserGun t = new TaserGun();
		Police p = new Police(g);
//		p.setWeapon(t);// setter, �ٸ� ����� ��ü
		

		Police p2 = new Police(t);

		p.fire();

		p.�������Ա�();
		p.������();
		System.out.println("---------------------");
		p2.������();
		p2.�������Ա�();
		//
		// g.fire();
		// g.reload();
		// System.out.println(p.bullet);
	}
}
