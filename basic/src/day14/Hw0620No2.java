package day14;

import java.io.File;
import java.io.IOException;

public class Hw0620No2 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		
		System.out.println("존재하나요? :"+f.exists());	//파일의 존재여부 리턴
		
		if(!f.exists()) {
			f.createNewFile();			//파일 생성
		}
		
		System.out.println("절대경로 : "+f.getAbsolutePath());		//파일의 절대 경로를 넘겨준다.
		
		if(f.isFile()) {				//해당 경로가 일반 파일인지 여부를 리턴
			System.out.println("파일입니다.");
		}else if(f.isDirectory()) {
			System.out.println("디렉토리입니다.");
		}
	}
}
