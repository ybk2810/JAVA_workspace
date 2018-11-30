package day08;
//복습
//oop
//	캡슐화
//	상속
//	추상화
//	다행성

//모든 클래스의 조상: Object
//자바에서 생략 가능한 것
//	1. extents Object
//	2. 생성자
//	3. 멤버변수를 가리키는 참조변수: this
//	4. super()
//	5. default
//	6. import java.lang.*;

//ctrl shift o 
//import java.lang.Math;
//import java.lang.Object;
//import java.lang.*;
//import java.util.Scanner;

public class ObjectEx1 extends Object{
	public static void main(String[] args) {
//		Math.random();
//		Scanner scanner = new Scanner(System.in);
		
		Object obj1 = new Object();
		Object obj2 = new Object();

//		obj1 = obj2;
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("동일한 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		if(obj1.equals(obj2)) {
			System.out.println("동일한 객체");
		}else {
			System.out.println("다른 객체");
		}
		System.out.println("-------------------");
		
		Class c = obj1.getClass();
		System.out.println("클래스명: "+c);
		
		System.out.println("obj1이 Object의 instance인가?"+(obj1 instanceof Object));
		System.out.println("-------------------");
		
		System.out.println("obj1: "+obj1);
		System.out.println("obj1.toString(): "+obj1.toString());
		System.out.println(obj1.getClass().getName() + '@' + Integer.toHexString(obj1.hashCode()));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
