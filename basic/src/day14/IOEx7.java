package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOEx7 {
	public static void main(String[] args) throws IOException {
		// 키보드의 입력을 화면에 출력
		File f = new File("c:\\keyboard.txt");

		// FileWriter fw = new FileWriter(f); // 한글로 저장
		// BufferedWriter bw = new BufferedWriter(fw);
		// PrintWriter pw = new PrintWriter(bw);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));

		// System.in : 키보드
		// System.out : 모니터
		System.out.print("입력(종료:ctl+z): ");
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			pw.println(line);
		}
		pw.flush();
	}
}
