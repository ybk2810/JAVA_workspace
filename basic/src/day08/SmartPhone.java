package day08;

public class SmartPhone extends Phone{
	String telecomCompany, os;
	final int MAX_NUMBER = 300;

//	SmartPhone(String manufacturer, String os, 
//			String modelName, String phoneNumber){
//		this.manufacturer = manufacturer;
//		this.os = os;
//		this.modelName = modelName;
//		this.phoneNumber = phoneNumber;			
//	}
	//생성자를 쉽게 만든는법
	//우측 소스 제너레이트 컨스트럭트 필드 
	SmartPhone(String manufacturer, String os, 
			String modelName, String phoneNumber){
		this.manufacturer = manufacturer;
		this.os = os;
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;			
	}
	
	public void playGame() {
		System.out.println("게임중");
	}
	


	public void useCamera() {
		System.out.println("카메라기능");
	}
}
