package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MTServer extends Thread {
	Socket s;

	MTServer(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		// 모든 클라이언트와 통신을 담당하는 코드
		// 1. 접속자 IP
		InetAddress inet = s.getInetAddress();
		String ip = inet.getHostAddress();
		System.out.println("환영합니다. " + ip);

		try {
			// 2. 수신객체
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 3. 발신객체
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())));
			// 4. 통신
			String msg = null;

			while ((msg = br.readLine()) != null) {
				System.out.println("[" + ip + "] : " + msg);
				pw.println(msg);
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
