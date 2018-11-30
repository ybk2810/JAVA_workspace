package day07;

public class 사각형 {
	private int width;
	private int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
	
//	@Override
	void getCalArea(){
		System.out.println("넓이는 " + width*height + "입니다.");
	}
}
