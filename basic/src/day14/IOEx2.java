package day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\CopyHello.java");
		
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f2);
		
//		int result = fis.read();//한바이트씩 아스키코드로 읽어옴
		int result = 0;
		while((result = fis.read())!=-1) {
			System.out.print((char)result); // 2byte단위인 한글을 읽어올수없음, 1byte씩 가져오기 때문
			fos.write(result); // 한글 생성가능
		}
	}
}
