package day14;

import java.io.File;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello1.java");
		
		System.out.println("존재하나요? " + f.exists());
		if(!f.exists()) {
			f.createNewFile();
		}
		
		System.out.println("절대경로: " + f.getAbsolutePath());
		
		// isXXX(): 결과 boolean 타입
		if(f.isFile()) {
			System.out.println("파일입니다");
		}else if(f.isDirectory()) {
			System.out.println("디렉토리입니다.");
		}
		
		//c:\\eclipse 디렉토리 f2 파일 객체
		// 존재? 존재한다는 메시지 출력
		
		
		File f2 = new File("c:\\eclipse");
		
		System.out.println("존재하나요? " + f2.exists());
		if(!f2.exists()) {
			f2.createNewFile();
		}
		
		System.out.println("절대경로: " + f2.getAbsolutePath());
		
		//파일? 디렉토리인지 판별해서 메세지 출력
		if(f2.isDirectory()) {
			System.out.println("디렉토리입니다.");
			String[] flist = f2.list();
			for(String x: flist) {
				System.out.println(x);
			}
		}
		
	}
}
