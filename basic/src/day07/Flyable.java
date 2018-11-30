package day07;
//상속은 무조건 단일 상속...

//그래서 다중상속의 효과위해 
//GUI
//CUI
//interface: 서로 관계가 없는 물체들이 상호작용을 하기 위해서 사용되는 장치나 시스템
public interface Flyable {
	//class: 설계도
	//interface: 추상메서드와 상수로만 구성
	public void fly();
//	public abstract void fly(); //abstract생략 가능
}
