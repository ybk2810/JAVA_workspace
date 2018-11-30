package day08;
// Phone 클래스를 상속받는 SmartPhone 클래스 작성

//통신사, os명 

//게임하기
//카메라 사용하기
//
public class Phone {
	String modelName, phoneNumber;
	static String manufacturer;
	int serialNumber;
	
	//전화걸기(전화번호)
	public static void call(String number) {
		System.out.println(number + "번호로 전화거는중..");
	}
	
	//전화받기
	public void receive() {
		System.out.println("여보세요~~~ ");
	}
	
}
