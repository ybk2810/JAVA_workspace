package day13;

public class TestMain2 {
	public static void main(String[] args) {
		Car c = new Car();
		Producter p1 = new Producter(c);
		Producter p2 = new Producter(c);
		Producter p3 = new Producter(c);
		
		
		Customer cust1 = new Customer(c);
		Customer cust2 = new Customer(c);
		Customer cust3 = new Customer(c);
		p1.start();
		p2.start();
		p3.start();
		cust1.start();
		cust2.start();
		cust3.start();
	}
}
