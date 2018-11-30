package day15;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();

		System.out.println("호스트명: " + inet.getHostName());
		System.out.println("IP    : " + inet.getHostAddress());

		System.out.println("--------------");

		InetAddress inet2 = InetAddress.getByName("www.naver.com");
		System.out.println(inet2.getHostName());
		System.out.println(inet2.getHostAddress());

		System.out.println("--------------");

		InetAddress[] inet3 = InetAddress.getAllByName("www.naver.com");
		for (InetAddress x : inet3) {
			System.out.println(x.getHostAddress());
		}

	}
}
