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
		
//		int result = fis.read();//�ѹ���Ʈ�� �ƽ�Ű�ڵ�� �о��
		int result = 0;
		while((result = fis.read())!=-1) {
			System.out.print((char)result); // 2byte������ �ѱ��� �о�ü�����, 1byte�� �������� ����
			fos.write(result); // �ѱ� ��������
		}
	}
}
