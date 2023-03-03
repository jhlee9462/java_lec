package com.edu.view;

import java.util.Scanner;

import com.edu.controller.StudentController;
import com.edu.entity.Student;

public class StudentMain {

	Scanner sc;
	StudentController control;
	Student entity;
	
	public StudentMain() {
		sc = new Scanner(System.in);
		control = new StudentController();
		entity = null;
	}
	
	public void menu() {
		while (true) {
			System.out.println("1.추가 2.삭제 3.전체보기 4.찾기 5.종료");
			System.out.print("선택(1~5) : ");
			int choice = Integer.parseInt(sc.next());
			
			switch (choice) {
			case 1:
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("국어: ");
				int kor = Integer.parseInt(sc.next());
				System.out.print("영어: ");
				int eng = Integer.parseInt(sc.next());
				System.out.print("수학: ");
				int mat = Integer.parseInt(sc.next());
				entity = new Student(0, kor, eng, mat, 0, name);
				
				System.out.println(control.insertStudent(entity));
				break;
			case 2:
				System.out.print("삭제할사람 : ");
				control.deleteStudent(sc.next());
				break;
			case 3:
				control.getStudentList();
				break;
			case 4:
				System.out.print("찾는사람 : ");
				control.getStudent(sc.next());
				break;
			case 5:
				System.out.println("*** 작업끝 ****");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new StudentMain().menu();
	}
	
}
