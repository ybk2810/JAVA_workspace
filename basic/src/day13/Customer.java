package day13;

import java.util.Random;

public class Customer extends Thread {
	private Car car;
	Random rnd = new Random();
	public Customer(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		// 1�ʿ� 1�뾿 20�� ���� ����
		
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(rnd.nextInt(4000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ���
			String carName = car.pop();
		}

	}
}
