package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
// tcp : 연결지향
// udp : 전송지향
public class UDPClient {

	public static void main(String[] args) {

		final int port = 8000;
		String server_ip;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = "";
		
		PrintStream ps = new PrintStream(System.out);
		
		try {
			ps.print("접속할 server ip : ");
			server_ip = br.readLine();
			
			while (true) {
				ps.print("\n전송할 메세지 : ");
				msg = br.readLine();
				
				DatagramSocket ds = new DatagramSocket();
				
				InetAddress ip = InetAddress.getByName(server_ip);
				byte[] buf = msg.getBytes();
				
				DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, port);
				
				ds.send(dp); // 데이터 전송
				ps.print(server_ip + "에 메세지 전송 성공..");
			}
		} catch (IOException e) {
		} finally {
			try {
				ps.close();
				br.close();
			} catch (IOException e) {
			}
		}
	}

}
