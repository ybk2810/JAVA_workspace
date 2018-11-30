package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// Ŭ���̾�Ʈ Socket => Socket
// ���� Socket => SververSocket

// IP, ���port �������
// http : 80 (8080�� �����ڸ��)
// htp : 21
// ssh : 22
// oracle : 1521
// mysql : 3306

// 8000~9000 �����ڸ� ���� �����ȣ

// 192.168.0.206, 5000 ��Ʈ ���� �õ�

public class NetEx2 {
	public static void main(String[] args) {
		// Ŭ���̾�Ʈ ���̵�
		try {
			Socket s = new Socket("192.168.0.11", 5000);
			System.out.println("����: " + s);

			OutputStream os = s.getOutputStream();

			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);

			// Ŭ���̾�Ʈ ���Ű�ü
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr);

			String msg = null;
			String str = null;
			while ((msg = keyboard.readLine()) != null) {
				pw.println(msg);
				pw.flush();

				str = br.readLine();
				System.out.println("������ ���� �޼���: " + str);
			}

		} catch (UnknownHostException e) {
			System.out.println("�߸��� IP�Դϴ�.");
		} catch (IOException e) {
			System.out.println("��� ����");
		}
	}
}
