package game;

public class Tank {
	int hp = 0;
	int at = 0;
	int sum = 0;
	Tank(Kang k){
		this.hp = k.hp;
		this.at = k.at;
		this.sum = 0;
	}
	
	Tank(Jo j){
		this.hp = j.hp;
		this.at = j.at;
		this.sum = 1;
	}
	
	Tank(Hong h){
		this.hp = h.hp;
		this.at = h.at;
		this.sum = 2;
	}
	
	Tank(Mo m){
		this.hp = m.hp;
		this.at = m.at;
		this.sum = 3;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void attack(Tank t2) {
		t2.hp -= at;
		System.out.println("t2 hp : "+t2.hp);
	}
}
