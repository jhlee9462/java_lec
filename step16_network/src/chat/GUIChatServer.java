package chat;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.*;

public class GUIChatServer extends JFrame implements ActionListener{
	TextArea txt_list;
	JButton btn_exit;
	
	// 테스트 1 -----------------
	ServerSocket ss = null;
	// 테스트 1 -----------------
	
	// 테스트 2 -----------------
	Vector<ChatHandle> inwon = null; // 인원을 카운트하는 변수
	// 테스트 2 -----------------
	
	public GUIChatServer()
	{
		super("Chatting Server");
		
		txt_list = new TextArea();
		btn_exit = new JButton("서버종료");
		
		add(txt_list, "Center");
		add(btn_exit,"South");
		setSize(250,250);
		setVisible(true);
		//이벤트처리-----------------------
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_exit.addActionListener(this);
		//----------------------------------
		
		// 테스트 2 -----------------
		inwon = new Vector<>(); // serverStart() 보다 먼저 동작
		// 테스트 2 -----------------
		
		serverStart();
	}
	
	
	public void serverStart()
	{
		final int PORT=7500;
		
		try{
			ss=new ServerSocket(PORT);
			while(true)
			{
				Socket sock=ss.accept();
				String str=sock.getInetAddress().getHostAddress();
				txt_list.append(str);
				
				// 테스트 2--------------------
				// 병행처리를 하기위한 client 객체생성(사용자정의 클래스)
				ChatHandle ch = new ChatHandle(this, sock);
				inwon.add(ch);
				ch.start();
				// 테스트 2--------------------
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_exit)
			System.exit(0);
	}
	// 테스트 2--------------------------------------------
	public void setMsg(String str) {
		txt_list.append(str);
	}
	// 테스트 2--------------------------------------------	
	
	public static void main(String[] args) {
		new GUIChatServer();
	}

}

// 테스트 2 -----------------------------------------------------------------------------
class ChatHandle extends Thread {

	GUIChatServer server;
	Socket sock;
	PrintWriter pw = null;
	BufferedReader br = null;
	
	public ChatHandle() {
	}
	
	public ChatHandle(GUIChatServer server, Socket sock) {
		this.server = server;
		this.sock = sock;
		try {
			pw = new PrintWriter(sock.getOutputStream());
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		} catch (IOException e) {}
		
	}
	
	@Override
	public void run() {
		String nickname = null;
		
		try {
			nickname = br.readLine();
			server.setMsg("[" + nickname + "]님이 입장하셨습니다\n");
			
			// 테스트 3 -----------------------------------------------------
			broadcast("[" + nickname + "]님이 입장하셨습니다\n");
			// 테스트 3 -----------------------------------------------------
			
			// 테스트 4 --------------------------------
			while (true) {
				try {
					String text = br.readLine();
					server.setMsg(nickname + " : " + text + "\n"); // 서버에 메세지 내용을 저장
					broadcast(nickname + " : " + text + "\n"); // 클라이언트에 메세지 송신
				} catch (IOException e) {
					return;
				}
			}
			// 테스트 4 --------------------------------
		} catch (IOException e) {
		// 테스트 5 --------------------------------
		} finally {
			synchronized (server.inwon) {
				server.inwon.remove(this);
				server.setMsg("[" + nickname + "] 님이 퇴장하셨습니다\n");
				broadcast("[" + nickname + "] 님이 퇴장하셨습니다\n");
			}
		}
		// 테스트 5 --------------------------------
	}
	// 테스트 3 ----------------------------------------------------
	// 모든 접속자에게 메세지를 보내줌
	public void broadcast(String str) {
		synchronized (server.inwon) { // 동기화처리
			int n = server.inwon.size(); // 접속자 객체의 수
			for (int i = 0; i < n; i++) { // 접속된 모든 클라이언트에 메세지를 송신
				ChatHandle ch = server.inwon.elementAt(i);
				ch.pw.println(str);
				ch.pw.flush();
			}
		}
	}
	// 테스트 3 ----------------------------------------------------	
}
//테스트 2 -----------------------------------------------------------------------------








