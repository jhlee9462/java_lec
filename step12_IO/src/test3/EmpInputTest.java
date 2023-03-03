package test3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EmpInputTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("src/test3/emp.txt"));
		
		String info = ""; 
		while ((info = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(info, "\t");
			System.out.println("이름 : " + st.nextToken() + "\t부서 : " + st.nextToken() + "\t급여 : " + st.nextToken());
		}
		
		br.close();
	}

}
