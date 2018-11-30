package day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//byte Stream
// Data InputStream: �پ��� �ڹ��� �ڷ����� �б�
// Data OutputStream: �پ��� �ڹ��� �ڷ�����  ���� 

// 
// �ڿ�
public class IOEx8 {
	public static void main(String[] args) {
		File f = new File("c:\\dos.txt");
		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(f));
			dis = new DataInputStream(new FileInputStream(f));
			
			dos.writeUTF("ȫ�浿");		// �̸�
			dos.writeInt(20);			// ����
			dos.writeFloat(180.0f);		// Ű
			dos.writeFloat(60.0f);		// ������
			dos.writeBoolean(true);		// true
			dos.writeFloat(1313.21f);	// ����ġ
			dos.writeInt(50000);		// ���ӸӴ�
			dos.writeInt(8);			// level
			
			String name = dis.readUTF();
			int age = dis.readInt();
			float height = dis.readFloat();
			float weight = dis.readFloat();
			boolean gender = dis.readBoolean();
			float exp = dis.readFloat();
			int money = dis.readInt();
			int level = dis.readInt();
			
			System.out.println("name: " + name);
			System.out.println("age: " + age);
			System.out.println("height: " + height);
			System.out.println("weight: " + weight);
			System.out.println("gender: " + (gender?"Man":"Woman"));
			System.out.println("exp: " + exp);
			System.out.println("money: " + money);
			System.out.println("level: " + level);
			
		} catch (FileNotFoundException e) {
			System.out.println();
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null)dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
