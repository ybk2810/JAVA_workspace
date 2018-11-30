package game;

public class Tank2P extends Fortress {
	
	int hp,at,mo, x,y;
	
	Tank2P(int hp, int at, int mo, int x, int y){
		this.hp = hp;
		this.at = at;
		this.mo = mo;
		this.x = x;
		this.y = y;
	}
	

	void attack(Fortress f) {
		f.hp -= at;
	}

	
}
