package day14;

import java.io.File;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello1.java");
		
		System.out.println("�����ϳ���? " + f.exists());
		if(!f.exists()) {
			f.createNewFile();
		}
		
		System.out.println("������: " + f.getAbsolutePath());
		
		// isXXX(): ��� boolean Ÿ��
		if(f.isFile()) {
			System.out.println("�����Դϴ�");
		}else if(f.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
		}
		
		//c:\\eclipse ���丮 f2 ���� ��ü
		// ����? �����Ѵٴ� �޽��� ���
		
		
		File f2 = new File("c:\\eclipse");
		
		System.out.println("�����ϳ���? " + f2.exists());
		if(!f2.exists()) {
			f2.createNewFile();
		}
		
		System.out.println("������: " + f2.getAbsolutePath());
		
		//����? ���丮���� �Ǻ��ؼ� �޼��� ���
		if(f2.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
			String[] flist = f2.list();
			for(String x: flist) {
				System.out.println(x);
			}
		}
		
	}
}
