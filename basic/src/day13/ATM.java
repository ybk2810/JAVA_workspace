package day13;

//ĸ��ȭ
//��ü�� ����� �� ���� ������ ����
//���� ������, ���� ������, ���� ������ acess modifier
//private: ���� Ŭ������������ ���ٰ���-
//default: ���� ��Ű���������� ���ٰ���
//protected: ���� ��Ű��+��� ������ Ŭ���������� ���ٰ��� #
//public: ��𿡼��� ���ٰ��� +
//������ ���� class diagram
public class ATM {
	private int balance;
	private int accountNo;
	private String name;
	// ������ ���� �ܺο����� �������� ���ϰ� ����

	// method�� ���ؼ� ���������� �����ϵ��� �������

	// setXXX(), getXXX()
	// setter, getter ����, ��������

	public void setBalance(int balance) {
		System.out.println("������");
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

	// �Ա�
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(money + "�� �Ա��մϴ�.");
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
	}

	// ���
	public synchronized void withDraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(money + "�� ����մϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
	}

	public ATM(int accountNo, String name, int money) {

		this.accountNo = accountNo;
		this.name = name;
		this.balance = money;
	}

}
