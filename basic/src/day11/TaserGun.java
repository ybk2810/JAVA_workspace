package day11;

public class TaserGun implements Weapon{
	int battery;
	int degree;
	
	public void fire() {
		battery -= 20;
		System.out.println("ġ����~~");
	}
	
	public void changeBattery() {
		System.out.println("ö��..");
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
