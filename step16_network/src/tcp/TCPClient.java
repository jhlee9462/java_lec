package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClient {

	final static int port = 7000;

	public static void main(String[] args) {

		String server_ip;

		// 콘솔로 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 콘솔로 출력
		PrintStream ps = new PrintStream(System.out);

		try {
			ps.print("접속할 ip주소를 입력하세요 : ");
			server_ip = br.readLine();
			
			while (true) {
				Socket sock = new Socket(server_ip, port); // 접속 시도
				
				// 네트워크를 통해서 데이터 전송
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
				
				ps.print("\n전송할 메세지를 입력하세요 : ");
				String str = br.readLine();
				
				bw.write(str, 0, str.length());
				bw.flush();
				bw.close();
				
				ps.println(server_ip + "에 메세지 전송");
				
			}
		} catch (IOException e) {
		}
	}

}
