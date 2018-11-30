package day13;

import java.util.ArrayList;
import java.util.Random;

// 자동차 공장
public class Car {
	ArrayList<String> list;
	String[] carNameList = {
			"티코", "붕붕카", "타요", " 프라이드", "람보르기니"
	};
	Random rnd = new Random();
	
	Car(){
		list =  new ArrayList<String>();
	}
	//차량의 이름 생성하는 메서드
	public String getCar() {
		// int length = carNameList.length;
		// int no = rnd.nextInt;
		// carNameList[no]
		return carNameList[rnd.nextInt(carNameList.length)];
	}
	// 차량 생성 method: push()
	public synchronized void push(String car) {
		System.out.println("차고상태: " + list);
		System.out.println("자동차가 생산되었습니다" + car);
		list.add(car);
		// 기다리던 고객들을 깨우기...
		if(list.size()>=3) {
			this.notifyAll();
		}
	}
	//차량 출고 method: pop()
	public synchronized String pop() {
		System.out.println("차고 상태" + list);
		if(list.size()==0) {
			System.out.println("고객님 기다리세요.");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String carName = list.remove(list.size()-1);
		System.out.println("출고합니다: "+carName);
		return carName;
	}
}
