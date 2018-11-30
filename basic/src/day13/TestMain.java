package day13;

import day06.ATM;

public class TestMain {
	public static void main(String[] args) {
		
		// 통장개설
		ATM atm = new ATM(111111,"홍길동",10000);
		
		// 동시에 여러 사용자가 입금, 출금
		ATMThread a1 = new ATMThread(atm);
		ATMThread a2 = new ATMThread(atm);
		ATMThread a3 = new ATMThread(atm);
		
		// 입출금 시작
		a1.start();
		a2.start();
		a3.start();
		
	}
}
