package udp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	
	public static void main(String[] args) {

		final int buffer = 50;
		final int port = 8000;
		String message = "";
		PrintStream ps = new PrintStream(System.out);
		
		try {
			DatagramSocket ds = new DatagramSocket(port); // UDP 소켓 생성
			ps.println("전송 대기중 ...");
			
			while (true) {
		
				byte[] buf = new byte[buffer];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
		
				message = new String(dp.getData());
				message = message.trim(); // 공백 지우기
				ps.print("\n들어온 메세지 : " + message);
				ps.flush();
				message = ""; // 데이터 비우는 과정
				
			}
		} catch (SocketException e) {
		} catch (IOException e) {
		} finally {
			ps.close();
		}
	}

}
