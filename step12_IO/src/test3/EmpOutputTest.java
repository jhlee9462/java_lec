package test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.PrintWriter;

// 주석처리 한 것은 수업에서 풀이한 방식이다.
public class EmpOutputTest {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/test3/emp.txt", true)); // append = true
//		PrintWriter pw = new PrintWriter("src/test3/emp.txt");
//		OutputStream os = new FileOutputStream("src/test3/emp.txt");
		
		String name, dept;
		int salary;
		
		System.out.println("입력을 종료하사려면 ctrl+z를 하시오");
		while (true) {
			System.out.print("이름을 입력하시오 : ");
			name = br.readLine();
			
			System.out.print("부서를 입력하시오 : ");
			dept = br.readLine();
			
			System.out.print("급여를 입력하시오 : ");
			salary = Integer.parseInt(br.readLine());
			
//			String str = name + "\t" + dept + "\t" + salary + "\n";
			
			bw.write(name + "\t" + dept + "\t" + salary + "\n");
			bw.flush();
			
//			os.write(str.getBytes());
//			os.flush();
			
			System.out.println("계속 입력하려면 Enter키를 누르시오");
			try {
				br.readLine().charAt(0);
			} catch (StringIndexOutOfBoundsException e) {
				continue;
			} catch (NullPointerException e) {
				System.out.println("ctrl+z");
				break;
			}
		}
		
//		do {
//			System.out.print("이름을 입력하시오 : ");
//			name = br.readLine();
//			
//			System.out.print("부서를 입력하시오 : ");
//			dept = br.readLine();
//			
//			System.out.print("급여를 입력하시오 : ");
//			salary = Integer.parseInt(br.readLine());
//			
//			// 파일에 출력
//			pw.print(name + "\t" + dept + "\t" + salary + "\n");
//			pw.flush();
//			System.out.println("계속 입력하려면 Enter키를 누르시오");
//			
//		} while (br.readLine() != null);
		
		System.out.println("emp.txt파일이 저장 되었습니다.");
		br.close();
		bw.close();
	}

}
