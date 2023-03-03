package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

// 사용하지 않는 포트 : 80 (http), 21 (ftp), 22 (ssh), 23 (telnet)
public class TCPServer {

	final static int port = 7000;
	
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(port);
			System.out.println("접속 대기중...");
			
			while (true) {
				Socket sock = ss.accept(); // 요청수락
				
				// 콘솔로 출력
				PrintStream ps = new PrintStream(System.out);
				
				// 네트워크를 통해 들어온 데이터를 읽어 들이는 과정
				BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				// 상대방 ip주소 출력
				ps.print(sock.getInetAddress().getHostAddress());
				ps.println("에서 수신된 메세지 : " + br.readLine() + "\n");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
