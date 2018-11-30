package day14;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Hw0620No4 {
    public static void main(String[] args) throws IOException {
        File f = new File("Hw0620No4.txt");
         
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
 
        System.out.println("입력(종료:Ctrl+z) : ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        int result = 0;
        while((result=isr.read())!=-1) {
            if(result>=65 && result<=87) {
                result+=3;
            }else if(result >=88 && result<90) {
                result-=23;
            }else if(result>=97 && result<=119) {
                result+=3;
            }else if(result >=120 && result<=122) {
                result-=23;
            }
            System.out.print((char)result);
            pw.print((char)result);
        }
        pw.flush();
    }
}