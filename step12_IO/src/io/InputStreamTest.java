package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {

		// 3. 버퍼 스트림 (buffer stream) 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Input String : ");
		String str = br.readLine();
		System.out.println(str);
		br.close();
		isr.close();
		
		// 2. 문자 스트림 (character stream) : 속도가 느림
//		InputStreamReader isr = new InputStreamReader(System.in);
//		System.out.print("Input String : ");
//		char ch = '\0';
//		while (ch != '\n') {
//			ch = (char) isr.read();
//			System.out.print(ch);
//		}
//		isr.close();
		
		// 1. 바이트 스트림 (byte stream), 한글 처리 x
//		System.out.print("Input String : ");
//		char ch = '\0';
//		while (ch != '\n') {
//			ch = (char) System.in.read(); // byte stream 처리
//			System.out.print(ch);
//		}
	}

}
