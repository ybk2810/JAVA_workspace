package day13;

// Thread : 프로세스내에서 실해되는 흐름의 단위

// 멀티 쓰레드 환경
// 1.Thread 클래스를 상속
//	1-1. Thread 클래스를 상속
//	1-2. 동시에 처리하고자 하는 코드를 run() override 해서 구현
//	1-3. start() method 호출
// 2.Runnable interface를 구현

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		String name = th.getName();
		System.out.println("현재 쓰레드 명: " + name);
	}
}
