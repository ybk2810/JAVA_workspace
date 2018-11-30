package game;

public class Kang extends Fortress{
	int x, y;
	int hp;
	int at;
	int mo;
	double an;

	Kang() {
		this.hp = 100;
		this.at = 30;
		this.mo = 30;
		this.an = 90.0d;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
