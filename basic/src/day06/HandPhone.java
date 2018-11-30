package day06;

public class HandPhone {
	String productName;
	String productType;
	int price;
	String phoneNumber;
	
	HandPhone(){
		System.out.println("기본 생성자");
		productName = "ipone";
		productType = "smart";
		price = 990000;
		phoneNumber = "010-0000-0000";
	}
	
	HandPhone(String p1, String p2, int p3, String p4){
		this();
		productName = p1;
		productType = p2;
		price = p3;
		phoneNumber = p4;
	}
	
	HandPhone(String p4, String p1, int p3){
		this();
		phoneNumber = p4;
		productName = p1;
		price = p3;
	}
}
