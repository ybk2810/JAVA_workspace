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
	//�����ڸ� ���� ����¹�
	//���� �ҽ� ���ʷ���Ʈ ����Ʈ��Ʈ �ʵ� 
	SmartPhone(String manufacturer, String os, 
			String modelName, String phoneNumber){
		this.manufacturer = manufacturer;
		this.os = os;
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;			
	}
	
	public void playGame() {
		System.out.println("������");
	}
	


	public void useCamera() {
		System.out.println("ī�޶���");
	}
}
