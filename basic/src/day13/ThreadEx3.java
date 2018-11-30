package day13;

import java.util.Random;

// 2. Runnable 인터페이스를 구현 방법
// 2-1. Runnable 인터페이스를 구현
// 2-2. run() override
// 2-3. Thread클래스 생성자(구현객체)
// 2-4. start()

public class ThreadEx3 implements Runnable {
   
   String name;
   
   ThreadEx3(String name){
      this.name = name;
   }
   
   @Override
   public void run() {
      
      Random rnd = new Random();
      
      for (int i = 1; i <= 100; i++) {
         
         try {
            Thread.sleep(rnd.nextInt(100));
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         
         System.out.println(name + " : " + i);
      }
   }
   
   public static void main(String[] args) {
      
      ThreadEx3 te1 = new ThreadEx3("천둥이");
      ThreadEx3 te2 = new ThreadEx3("번개");
      
      Thread th1 = new Thread(te1);
      Thread th2 = new Thread(te2);
      
      th1.setPriority(Thread.MAX_PRIORITY);
      th1.start();
      th2.start();
      
   }

}