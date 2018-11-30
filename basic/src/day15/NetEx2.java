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

// 클라이언트 Socket => Socket
// 서버 Socket => SververSocket

// IP, 통신port 접속통로
// http : 80 (8080은 관리자모드)
// htp : 21
// ssh : 22
// oracle : 1521
// mysql : 3306

// 8000~9000 개발자를 위한 예비번호

// 192.168.0.206, 5000 포트 접속 시도

public class NetEx2 {
	public static void main(String[] args) {
		// 클라이언트 사이드
		try {
			Socket s = new Socket("192.168.0.11", 5000);
			System.out.println("성공: " + s);

			OutputStream os = s.getOutputStream();

			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);

			// 클라이언트 수신객체
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr);

			String msg = null;
			String str = null;
			while ((msg = keyboard.readLine()) != null) {
				pw.println(msg);
				pw.flush();

				str = br.readLine();
				System.out.println("서버가 보낸 메세지: " + str);
			}

		} catch (UnknownHostException e) {
			System.out.println("잘못된 IP입니다.");
		} catch (IOException e) {
			System.out.println("통신 실패");
		}
	}
}
