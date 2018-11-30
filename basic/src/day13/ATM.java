package day13;

//캡슐화
//객체를 사용할 때 접근 권한을 설정
//접근 지정자, 접근 한정자, 접근 수정자 acess modifier
//private: 현재 클래스내에서만 접근가능-
//default: 현재 패키지내에서만 접근가능
//protected: 현재 패키지+상속 관계의 클래스에서만 접근가능 #
//public: 어디에서든 접근가능 +
//마지막 약자 class diagram
public class ATM {
	private int balance;
	private int accountNo;
	private String name;
	// 변수의 값을 외부에서는 수정하지 못하게 설정

	// method를 통해성 간접적으로 수정하도록 방법제공

	// setXXX(), getXXX()
	// setter, getter 지정, 가져오는

	public void setBalance(int balance) {
		System.out.println("감사기록");
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// 입금
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금합니다.");
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}

	// 출금
	public synchronized void withDraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(money + "원 출금합니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}

	public ATM(int accountNo, String name, int money) {

		this.accountNo = accountNo;
		this.name = name;
		this.balance = money;
	}

}
