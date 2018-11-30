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
		// Ű������ �Է��� ȭ�鿡 ���
		File f = new File("c:\\keyboard.txt");

		// FileWriter fw = new FileWriter(f); // �ѱ۷� ����
		// BufferedWriter bw = new BufferedWriter(fw);
		// PrintWriter pw = new PrintWriter(bw);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));

		// System.in : Ű����
		// System.out : �����
		System.out.print("�Է�(����:ctl+z): ");
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
