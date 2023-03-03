package com.edu.entity;

public class Student {

	private int mid, kor, eng, mat, rank;
	private String name;
	
	public Student() {
	}

	public Student(int mid, int kor, int eng, int mat, int rank, String name) {
		super();
		this.mid = mid;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.rank = rank;
		this.name = name;
	}

	public int getMid() {
		return mid;
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

	public int getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getTot() {
		return kor + eng + mat;
	}
	
	public double getAvg() {
		return getTot() / 3.0;
	}
	
	public char getGrade() {
		char grade = '\0';
		double avg = getAvg();
		
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
	
	public String getResult() {
		String result = (getGrade() == 'F') ? "불합격" : "합격";
		return result;
	}
	
	public String toString() {
		return mid + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + getTot() + "\t" + String.format("%.2f", getAvg()) + "\t" + getGrade() + "\t" + getResult() + "\t" + rank;
	}
}
