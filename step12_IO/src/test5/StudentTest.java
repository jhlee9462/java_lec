package test5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("src/test5/student.dat");
		FileWriter fw = new FileWriter("src/test5/backup.dat");
		Scanner sc = new Scanner(fr);
		
		List<Student> students = new ArrayList<>();
		
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str, "-:/");
			
			String name = st.nextToken();
			st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			st.nextToken();
			int eng = Integer.parseInt(st.nextToken());
			st.nextToken();
			int mat = Integer.parseInt(st.nextToken());
			
			students.add(new Student(name, kor, eng, mat));
		}
		
		int korTotal = 0, engTotal = 0, matTotal = 0;
		for (Student student : students) {
			korTotal += student.getKor();
			engTotal += student.getEng();
			matTotal += student.getMat();
		}
		
		int studentNum = students.size();
		fw.write("============================\n");
		fw.write("총학생수 = " + studentNum + "명\n");
		fw.write("국어 총합 = " + korTotal + " 국어 평균 = " + korTotal / studentNum + "\n");
		fw.write("영어 총합 = " + engTotal + " 영어 평균 = " + engTotal / studentNum + "\n");
		fw.write("수학 총합 = " + matTotal + " 수학 평균 = " + matTotal / studentNum + "\n");
		fw.write("============================\n");
		fw.flush();
		
		fr.close();
		fw.close();
		sc.close();
		System.out.println("backup.dat파일이 생성되었습니다.");

	}

}
