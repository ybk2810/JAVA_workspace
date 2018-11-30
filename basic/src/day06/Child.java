package day06;

//상속 
public class Child extends Parent {

	
	Child(){
//		super("홍길동");	// 평소엔 생략되어있음
		super.name = "홍길동"; // 나를 가르키는 변수는 this, 부모를 가르키는 키워드는 super
		age = 20;
		//job = "도적";
		sex = "남자";
		System.out.println("Child 클래스의 기본 생성자");
	}
	
	// @키워드 
	@Override	//annotation 오버라이드하려고 하는 메서드 위에 지정 
	public void 노래부르기() {
		System.out.println("a\r\n"+"bcd");
	}
	public void 클럽가기() {
		System.out.println("냠냠");
	}
}
