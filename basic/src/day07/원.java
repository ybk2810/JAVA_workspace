package day07;

public class 원 {
	private int r;
	
	public void setR(int r) {
		this.r = r;
	}
	public int getR() {
		return r;
	}

	void getCalArea(){
		System.out.println("넓이는 " + (r*r*Math.PI) + "입니다.");
	}
}
