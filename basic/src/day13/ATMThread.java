package day13;

import java.util.Random;

import day06.ATM;

// ���ÿ� ���� ����ڰ� ������� ����

public class ATMThread extends Thread{
	ATM atm;
	Random rnd = new Random();

	ATMThread(ATM atm) {
		this.atm = atm;
	}
	
	@Override
	public void run() {

		boolean flag = true;
		for(int i = 0; i<5; i++) {
			if(flag) {
				// 1�� ���
				atm.deposit(5000);
			}else {
				// 1�� �Ա�
				atm.withDraw(5000);
			}
			flag = !flag;
		}
	
	
	}
}
