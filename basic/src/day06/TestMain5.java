package day06;

//import day05.����;

// ATM
public class TestMain5 {
	public static void main(String[] args) {
		ATM atm = new ATM();
//		���� m1 = new ����();

		// System.out.println(atm.balance);
		// atm.balance=99999999;
		// ������ �������� ����
		// ������ x
		
		// method�� ��������		
		atm.setBalance(10000);

		atm.deposit(3000);
		atm.withDraw(5000);
		
		//setter, getter
//		atm.accountNo=123456;
		atm.setAccountNo(9999);
		
		atm.setName("�迵��");
	}
}
