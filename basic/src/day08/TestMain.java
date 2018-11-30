package day08;

//Phone, SmartPhone
public class TestMain {
	
	//public: 어디에서나 접근가능한
	//static: instance 생성없이 접근가능한
	//void: return 값이 없는
	//main: main이라는 이름의 method
	//매개변수(String[] args) 갖는 메서드
	public static void main(String[] args) {
		
		SmartPhone.manufacturer = "삼쑹";
		// static 의미
		// 인스턴스화 하기전부터 사용가능한 변수
		// 해당 클래스의 공용변수
		SmartPhone.call("119");
		
//		SmartPhone sp1 = new SmartPhone("화웨이", "안드로이드", "노바", "010-1234-5678");
//		SmartPhone sp2 = new SmartPhone("화웨이", "안드로이드", "아너7x", "010-3333-4444");
//		sp1.call("010-1111-2222");
//		sp1.receive();
//		
//		sp1.manufacturer = "샤오미";
////		sp2.manufacturer = "샤오미";
//		//static 때문에 모두 변경됨 
//		
//		System.out.println(sp1.manufacturer);
//		System.out.println(sp2.manufacturer);
//		
//		
//		
//		
		
	}
}
