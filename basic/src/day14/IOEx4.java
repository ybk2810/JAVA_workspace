package day14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// �ѱ��� �����ü��ִ�.
// ������ byte�迭 , �ѱ��� char�迭
public class IOEx4 {
   public static void main(String[] args) throws IOException {
      
      File f = new File("c:\\Hello.java");
      File f2 = new File("c:\\Hello2.java");

      FileReader fr = new FileReader(f);
      FileWriter fw = new FileWriter(f2);

      int result = 0;
      while ((result = fr.read()) != -1) {
         fw.write(result);
         System.out.print((char)result);
      }
      fw.flush();

   }
}