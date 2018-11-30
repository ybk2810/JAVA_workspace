package day06;

//import day05.마린;

// ATM
public class TestMain5 {
	public static void main(String[] args) {
		ATM atm = new ATM();
//		마린 m1 = new 마린();

		// System.out.println(atm.balance);
		// atm.balance=99999999;
		// 권한이 없는자의 변경
		// 감사기록 x
		
		// method는 로직가능		
		atm.setBalance(10000);

		atm.deposit(3000);
		atm.withDraw(5000);
		
		//setter, getter
//		atm.accountNo=123456;
		atm.setAccountNo(9999);
		
		atm.setName("김영복");
	}
}
