package day14;

import java.io.File;
import java.io.IOException;

public class Hw0620No2 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		
		System.out.println("�����ϳ���? :"+f.exists());	//������ ���翩�� ����
		
		if(!f.exists()) {
			f.createNewFile();			//���� ����
		}
		
		System.out.println("������ : "+f.getAbsolutePath());		//������ ���� ��θ� �Ѱ��ش�.
		
		if(f.isFile()) {				//�ش� ��ΰ� �Ϲ� �������� ���θ� ����
			System.out.println("�����Դϴ�.");
		}else if(f.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
		}
	}
}
