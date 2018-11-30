package day11;

public class TaserGun implements Weapon{
	int battery;
	int degree;
	
	public void fire() {
		battery -= 20;
		System.out.println("Ä¡ÀÌÀÍ~~");
	}
	
	public void changeBattery() {
		System.out.println("Ã¶ÄÃ..");
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		
	}
	
	
}
