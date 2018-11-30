package day13;

import java.util.Random;

// 2. Runnable �������̽��� ���� ���
// 2-1. Runnable �������̽��� ����
// 2-2. run() override
// 2-3. ThreadŬ���� ������(������ü)
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
      
      ThreadEx3 te1 = new ThreadEx3("õ����");
      ThreadEx3 te2 = new ThreadEx3("����");
      
      Thread th1 = new Thread(te1);
      Thread th2 = new Thread(te2);
      
      th1.setPriority(Thread.MAX_PRIORITY);
      th1.start();
      th2.start();
      
   }

}