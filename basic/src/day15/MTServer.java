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
		// ��� Ŭ���̾�Ʈ�� ����� ����ϴ� �ڵ�
		// 1. ������ IP
		InetAddress inet = s.getInetAddress();
		String ip = inet.getHostAddress();
		System.out.println("ȯ���մϴ�. " + ip);

		try {
			// 2. ���Ű�ü
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 3. �߽Ű�ü
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())));
			// 4. ���
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
