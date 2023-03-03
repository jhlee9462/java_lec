package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* $ CopyFile src/file/data2.txt src/file/data5.txt
 * 
 * src/file/data2.txt파일이 src/file/data5.txt로 복사되었습니다.
 */
public class CopyFile {

	public static void main(String[] args) throws IOException {

		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] buf = new byte[(int) file1.length()];
		bis.read(buf, 0, buf.length);
		bos.write(buf);
		bos.flush();
		
		bis.close();
		bos.close();
		
//		Reader in = new FileReader(file1);
//		Writer out = new FileWriter(file2);
//		
//		int ch;
//		while ((ch = in.read()) != -1) {
//			out.write(ch);
//		}
//		
		System.out.println(args[0] + "파일이 " + args[1] + "로 복사되었습니다.");
//		
//		in.close();
//		out.close();
	}

}
