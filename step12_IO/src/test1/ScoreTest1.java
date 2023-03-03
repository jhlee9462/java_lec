package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Student {

	private String name;
	private int kor, eng, mat;

	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
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

	public int getTotal() {
		return kor + eng + mat;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " 총점 : " + getTotal() + " 평균 : " + String.format("%.2f", (getTotal() / 3.0));
	}

}

public class ScoreTest1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("src/test1/score1.txt"));

		Student s1 = new Student(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
				Integer.parseInt(br.readLine()));
		System.out.println(s1);

		Student s2 = new Student(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
				Integer.parseInt(br.readLine()));
		System.out.println(s2);

		br.close();
	}

}
