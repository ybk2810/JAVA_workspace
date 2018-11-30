package day15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(5500);
			while (true) {
				System.out.println("Ŭ���̾�Ʈ ���Ӵ����...");
				Socket s = ss.accept();
				System.out.println(s);
				MTServer ms = new MTServer(s);
				ms.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
