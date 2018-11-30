package day13;

import java.util.Random;

import day06.ATM;

// 동시에 여러 사용자가 입출금을 수행

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
				// 1번 출금
				atm.deposit(5000);
			}else {
				// 1번 입금
				atm.withDraw(5000);
			}
			flag = !flag;
		}
	
	
	}
}
