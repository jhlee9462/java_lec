package com.edu.view;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.edu.entity.Student;

public class StudentView {

	public void insertStudent(int n, String name) {
		System.out.println(name + "을 추가했습니다");
	}
	
	public void deleteStudent(int n, String name) {
		System.out.println("삭제되었습니다");
	}
	
	public void getStudentList(ArrayList<Student> list) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t결과\t순위");
		System.out.println("-----------------------------------------------------------------------------");
		for (Student entity : list) {
			System.out.println(entity);
		}
	}
	
	public void getStudent(Student ob) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(ob.getName() + "의 총점은 " + ob.getTot() + "점이고 평균은 " + df.format(ob.getAvg()) + "점입니다");
		System.out.println("학점은 " + ob.getGrade() + "이고 결과는 " + ob.getResult() + "입니다.");
	}
}
