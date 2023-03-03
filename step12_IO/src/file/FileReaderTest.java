package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 문자 단위 읽기
		Reader in = new FileReader("storage/data3.txt");
		BufferedReader br = new BufferedReader(in);
		
//		int ch;
//		while ((ch = in.read()) != -1) {
//			System.out.print((char) ch);
//			Thread.sleep(100);
//		}
		
		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		in.close();
		
//		// 바이트 단위 읽기
//		File file = new File("storage/data3.txt");
//		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
//		
//		byte[] buf = new byte[(int) file.length()];
//		
//		/* int x = */bis.read(buf, 0, buf.length - 100);
////		System.out.println(x);
//		
//		System.out.println(new String(buf));
//		
//		bis.close();
	}

}
