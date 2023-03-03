package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("src/file/data1.txt");
		
		String name = "뽀로로";
		int age = 25;
		double tall = 183.5;
		
		out.write(name.getBytes());
		out.write(Integer.toString(age).getBytes());
		out.write(Double.toString(tall).getBytes());
		
		// 출력 바이트 스트림 필터링
		PrintStream ps = new PrintStream(out);
		// System.out(화면출력), out(파일로 출력)
		ps.printf("\n\n\r이름 : %s 나이 : %d 신장 : %.1f\n", name, age, tall);
		
		PrintWriter pw = new PrintWriter(out);
		pw.printf("\n\n\r이름 : %s 나이 : %d 신장 : %.1f\n", name, age, tall);
		
		pw.flush();
		
		out.flush();
		
		System.out.println("저장되었습니다.");
		out.close();
	}
	
}
