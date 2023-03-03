package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* byte -- InputStream
 * 		-- OutputStream
 * character -- Reader
 * 			 -- Writer
 */
public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		OutputStream out = null;
		out = new FileOutputStream("src/file/data2.txt");
		int value;
		
		System.out.println("문자열을 입력하고 마지막 줄에서 Ctrl + Z 로 종료하세요");
		while ((value = System.in.read()) != -1) { // -1 : EOF
			out.write(value);
		}
		System.out.println("data2.txt로 저장되었습니다.");
		
		out.flush();
		out.close();
	}

}
