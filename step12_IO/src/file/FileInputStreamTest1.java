package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		// 3.
//		Reader is = new FileReader("src/file/data1.txt");
		InputStreamReader is = new FileReader("src/file/data1.txt");
		BufferedReader br = new BufferedReader(is);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			Thread.sleep(100);
		}
		br.close();
		is.close();
		
		// 2.
//		InputStreamReader is = new FileReader("src/file/data1.txt");
//		
//		int readData;
//		while (true) {
//			readData = is.read(); // 문자단위로 읽음, 한글 안깨짐
//			if (readData == -1) // -1 은 데이트 스트림의 끝
//				break;
//			System.out.print((char) readData);
//			Thread.sleep(100); // 100/1000 초의 지연시간
//		}
//		
//		is.close();
		
		// 1.
//		InputStream is = new FileInputStream("src/file/data1.txt");
//		
//		int readData;
//		while (true) {
//			readData = is.read(); // 바이트로 읽음, 한글 깨짐
//			if (readData == -1) // -1 은 데이트 스트림의 끝
//				break;
//			System.out.print((char) readData);
//			Thread.sleep(100); // 100/1000 초의 지연시간
//		}
//		
//		is.close();
	}
	
}
