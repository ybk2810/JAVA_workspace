package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOEx6 {
   public static void main(String[] args) throws IOException {
      
      File f = new File("c:\\Hello.java");
      File f2 = new File("c:\\Hello2.java");

      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);

      FileWriter fw = new FileWriter(f2);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
      
      //br.readLine(); // 한줄씩 가져온다.
      String line = null;
      while ((line = br.readLine()) != null) {
         System.out.println(line);
         pw.println(line);
      }
      pw.println(300.0f);
      pw.println("우리나라 만세");
      pw.println(true);
      pw.flush();
      
   }
}