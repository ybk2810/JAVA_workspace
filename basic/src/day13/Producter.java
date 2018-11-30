package day13;

public class Producter extends Thread {
	private Car car;
	
	// �Ű����� �ִ� ������
	public Producter(Car car) {
		super();
		this.car = car;
	}
	
	@Override
	public void run() {
		//20 �� ����
		for(int i = 0; i<20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		// ���̸� ������
		String carName = car.getCar();
		
		// ���� �� �ֱ�
		car.push(carName);
		}
	}
	
}
