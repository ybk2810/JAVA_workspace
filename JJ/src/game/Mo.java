package game;

import java.util.Random;

public class Mo {
	int x, y;
	int hp;
	int at;
	int mo;
	double an;

	Random rnd = new Random();

	Mo() {
		this.hp = rnd.nextInt(250) + 1;
		this.at = rnd.nextInt(200) + 1;
		this.mo = 20;
		this.an = 90.0d;
		System.out.println("hp : "+hp);
		System.out.println("at : "+at);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;

	}
}
