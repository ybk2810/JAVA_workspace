package day13;

import day06.ATM;

public class TestMain {
	public static void main(String[] args) {
		
		// ���尳��
		ATM atm = new ATM(111111,"ȫ�浿",10000);
		
		// ���ÿ� ���� ����ڰ� �Ա�, ���
		ATMThread a1 = new ATMThread(atm);
		ATMThread a2 = new ATMThread(atm);
		ATMThread a3 = new ATMThread(atm);
		
		// ����� ����
		a1.start();
		a2.start();
		a3.start();
		
	}
}
