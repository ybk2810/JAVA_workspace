package day06;

public class TestMain4 {
	public static void main(String[] args) {

		마린 m1 = new 마린();
		마린 m2 = new 마린(10, 500);
		메딕 me = new 메딕();
		// Person p = new Person("토르", "신", 500);

		m1.공격하기();
		m1.이동하기();

		System.out.println("m1.hp: " + m1.hp);
		System.out.println("m1.공격력: " + m1.공격력);

		System.out.println("m2.hp: " + m2.hp);
		System.out.println("m2.공격력: " + m2.공격력);

		// p = m1;
		// m2=m1;
		// System.out.println(m2.hp);

		m2.status();
		System.out.println("------------");
		System.out.println("main method" + m2);
		m1.공격하기(m2);
		m2.status();

		System.out.println("------------");
		me.치료(m2);// call by reference
		m2.status();
	}
}
// java 이름 규정 규칙
// 1.A~Z,a~z,0~9,_,$
// 2.첫글자 문자
// 3.예약어 쓸수없다.
// 4.의미있게
// 5.공백x
//
// 클래스명 
// 첫글자는 대문자, 나머지는 소문자
// 두개 이상의 단어: 합성어 ex)BigData
//
// 변수명
// 첫글자 소문자
// 두개 이상의 단어: 합성어 뒷단어의 첫글자 대문자 ex)smallValue
//
// method명
// 첫글자 소문자
// ()붙어면 method
// 두개 이상의 단어: 합성어 뒷단어의 첫글자 대문자 ex)smallValue
//
// 생성자
// 첫글자 대문자
// ()붙어면 method
// 두개 이상의 단어: 합성어 뒷단어의 첫글자 대문자 ex)smallValue
//
// 상수
// 모두 대문자
// MAXVALUE
// 합성어인 경우 _ 붙음 MAX_VALUE

//GuestData 클래스명
//getNumber() method명
//Test() 생성자명
//SMALL_DATA 상수
//value 변수
//setValue() method명
//BoardTest 클래스명
//Tech() 생성자명
//NumberValue 클래스명
//TEST_VALUE 상수





