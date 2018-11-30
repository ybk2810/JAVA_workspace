package day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//Buffer사용하면 빨라짐
public class IOEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello2.java");
		
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f2);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int result = 0;
		while((result = bis.read())!=-1) {
			System.out.print((char)result);
			bos.write(result);
		}
		bos.flush();//버퍼에 쌓인 것을 비워주는 역할
	}
}
