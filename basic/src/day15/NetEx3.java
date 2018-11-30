package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetEx3 {
	public static void main(String[] args) {
		// 서버사이드
		try {
			ServerSocket ss = new ServerSocket(5000);
			System.out.println("접속대기중...");
			Socket client = ss.accept(); // 사용자의 접속을 대기
			System.out.println("-------");
			System.out.println("접속성공");
			InetAddress inet = client.getInetAddress();
			System.out.println("환영합니다: " + inet.getHostAddress());
			InputStream is = client.getInputStream();
			// int result = is.read();
			// System.out.println(result);

			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// OutputStream
			PrintWriter pw = 
				new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							client.getOutputStream())));
//			OutputStream os = client.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(os);
//			BufferedWriter bw = new BufferedWriter(osw);
//			PrintWriter pw = new PrintWriter(bw);
			
			
			
			String msg = null;
			
			while((msg = br.readLine())!= null) {
				System.out.println(msg);
				
				pw.println(msg);
				pw.flush();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
