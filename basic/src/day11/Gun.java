package day11;

public class Gun implements Weapon {
	int bullet;
	
	Gun(){
		bullet = 8;
	}
	
	public void fire() {
		bullet--;
		System.out.println("»§~~~");
	}
	public void reload() {
		bullet = 8;
		System.out.println("Ã¶ÄÀ~~");
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		fire();
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		reload();
	}
}
