package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
	
	private String name;
	private int kor, eng, mat, tot;
	private double avg;
	
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		setTot();
		setAvg();
	}
	
	public void setTot() {
		tot = kor + eng + mat;
	}
	
	public void setAvg() {
		avg = tot / 3.0;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " 총점 : " + tot + " 평균 : " + String.format("%.2f", avg);
	}
}

public class ScoreTest2 {

	public static List<Student> students = new ArrayList<>();
	
	public static void addStudent() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/test2/score2.txt"));
		while (true) {
			String name = br.readLine();
			if (name == null)
				break;
			students.add(new Student(name, Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
		}
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		addStudent();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/test2/dest.txt"));
		
		for (Student student : students)
			bw.write(student.toString() + "\n");
		
		bw.close();
		
		System.out.println("dest.txt에 복사를 완료했습니다.");
	}

}
