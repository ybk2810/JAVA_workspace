package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx5 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello3.java");

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = null;

		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);

		br.readLine(); // 한줄 씩 가져온다.
		while ((line = br.readLine()) != null) {
			System.out.print(line+"\n");
			bw.write(line);
		}
		bw.flush();// 버퍼에 쌓인 것을 비워주는 역할
	}
}
