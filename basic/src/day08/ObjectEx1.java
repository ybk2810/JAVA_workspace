package day08;
//����
//oop
//	ĸ��ȭ
//	���
//	�߻�ȭ
//	���༺

//��� Ŭ������ ����: Object
//�ڹٿ��� ���� ������ ��
//	1. extents Object
//	2. ������
//	3. ��������� ����Ű�� ��������: this
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
			System.out.println("������ ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
		
		if(obj1.equals(obj2)) {
			System.out.println("������ ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
		System.out.println("-------------------");
		
		Class c = obj1.getClass();
		System.out.println("Ŭ������: "+c);
		
		System.out.println("obj1�� Object�� instance�ΰ�?"+(obj1 instanceof Object));
		System.out.println("-------------------");
		
		System.out.println("obj1: "+obj1);
		System.out.println("obj1.toString(): "+obj1.toString());
		System.out.println(obj1.getClass().getName() + '@' + Integer.toHexString(obj1.hashCode()));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
