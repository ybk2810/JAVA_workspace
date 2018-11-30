package day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOEx9 {
	public static void main(String[] args) {

		Member m = new Member("aaa", "È«±æµ¿", "hong@hong.com", "bbb", 20);
		File f = new File("c:\\objectSave.txt");

		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(f);
			fis = new FileInputStream(f);

			oos = new ObjectOutputStream(fos);
			ois = new ObjectInputStream(fis);

			oos.writeObject(m);

			Object obj = ois.readObject();
			Member m2 = (Member) obj;
			System.out.println("ÀÌ¸§ : " + m2.getName());
			System.out.println("id : " + m2.getId());
			System.out.println("pw : " + m2.getPw());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
				if (oos != null)
					oos.close();
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}