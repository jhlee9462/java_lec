package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressEx2 {

	public static void main(String[] args) throws UnknownHostException {

		String host = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홈페이지 주소 : ");
		host = sc.nextLine();
		InetAddress[] addr = InetAddress.getAllByName(host);
		
		System.out.println(host + "는 " + addr.length + "개의 ip 주소를 가지고 있음");
		
		for (int i = 0; i < addr.length; i++) {
			System.out.println((i + 1) + "번 ip 주소는 " +addr[i].getHostAddress());
		}
		
		sc.close();
	}

}
