package day06;

public class HandPhoneTestMain {
	public static void main(String[] args) {
		HandPhone hp1 = new HandPhone();
		HandPhone hp2 = new HandPhone("ipone","smart",1100000,"010-7377-2810");
		HandPhone hp3 = new HandPhone("010-1234-5678","samsung",700000);
		
		System.out.println("-----------");
		System.out.println("phoneNumber: "+hp1.phoneNumber);
		System.out.println("productName: "+hp1.productName);
		System.out.println("productType: "+hp1.productType);
		System.out.println("price: "+hp1.price);
		
		System.out.println("-----------");
		System.out.println("phoneNumber: "+hp2.phoneNumber);
		System.out.println("productName: "+hp2.productName);
		System.out.println("productType: "+hp2.productType);
		System.out.println("price: "+hp2.price);
		
		System.out.println("-----------");
		System.out.println("phoneNumber: "+hp3.phoneNumber);
		System.out.println("productName: "+hp3.productName);
		System.out.println("price: "+hp3.price);
	}
}
