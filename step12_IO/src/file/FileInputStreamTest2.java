package file;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Reader in = new FileReader("src/file/data2.txt");
		
		int ch;
		while ((ch = in.read()) != -1) {
			System.out.print((char) ch);
			Thread.sleep(100);
		}
		
		in.close();
	}

}
