package day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//byte Stream
// Data InputStream: 다양한 자바의 자료형을 읽기
// Data OutputStream: 다양한 자바의 자료형을  저장 

// 
// 자원
public class IOEx8 {
	public static void main(String[] args) {
		File f = new File("c:\\dos.txt");
		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(f));
			dis = new DataInputStream(new FileInputStream(f));
			
			dos.writeUTF("홍길동");		// 이름
			dos.writeInt(20);			// 나이
			dos.writeFloat(180.0f);		// 키
			dos.writeFloat(60.0f);		// 몸무게
			dos.writeBoolean(true);		// true
			dos.writeFloat(1313.21f);	// 경험치
			dos.writeInt(50000);		// 게임머니
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
