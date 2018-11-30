package day13;

import java.util.Random;

public class ThreadEx2 extends Thread{
	private static final String Try = null;

	ThreadEx2(String name){
		super(name); //
	}
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		String name = th.getName();
		Random rnd = new Random();
		for(int i = 0; i<=100; i++) {
				try {
					Thread.sleep(rnd.nextInt(100));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(name + ": " + i+"미터 달리는중");
		}
	}
	
	public static void main(String[] args) {
		ThreadEx2 th1 = new ThreadEx2("A");
		ThreadEx2 th2 = new ThreadEx2("B");
		th1.start();
		th2.start();
		
	}
}
