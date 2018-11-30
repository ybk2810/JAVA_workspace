package day13;

public class Producter extends Thread {
	private Car car;
	
	// 매개변수 있는 생성자
	public Producter(Car car) {
		super();
		this.car = car;
	}
	
	@Override
	public void run() {
		//20 대 생산
		for(int i = 0; i<20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		// 차이름 얻어오기
		String carName = car.getCar();
		
		// 차고에 차 넣기
		car.push(carName);
		}
	}
	
}
