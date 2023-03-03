package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
//		input
		try {
			FileInputStream file = new FileInputStream("src/io/result.txt");
			DataInputStream dis = new DataInputStream(file);

			System.out.println("이름 : " + dis.readUTF());
			System.out.println("나이 : " + dis.readInt());
			System.out.println("신장 : " + dis.readDouble());
			
			System.out.println("이름 : " + dis.readUTF());
			System.out.println("나이 : " + dis.readInt());
			System.out.println("신장 : " + dis.readDouble());

			dis.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		
		
//		output
//		try {
//			FileOutputStream file = new FileOutputStream("src/io/result.txt");
//			DataOutputStream dos = new DataOutputStream(file);
//			
//			dos.writeUTF("둘리");
//			dos.writeInt(23);
//			dos.writeDouble(173.5);
//			
//			dos.writeUTF("도우너");
//			dos.writeInt(22);
//			dos.writeDouble(171.1);
//			
//			dos.flush();
//			
//			dos.close();
//			file.close();
//			System.out.println("result.txt 파일이 저장되었습니다.");
//			
//		} catch (FileNotFoundException e) {
//			
//		} catch (IOException e) {
//			
//		}
	}

}
