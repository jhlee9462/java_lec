package com.edu.controller;

import com.edu.dao.StudentDAO;
import com.edu.entity.Student;
import com.edu.view.StudentView;

public class StudentController {

	StudentDAO dao;
	StudentView view;
	
	public StudentController() {
		dao = new StudentDAO();
		view = new StudentView();
	}
	
	public void getStudentList() {
		view.getStudentList(dao.getStudentList());
	}
	
	public void getStudent(String name) {
		view.getStudent(dao.getStudent(name));
	}
	
	public String insertStudent(Student ob) {
		if ((ob.getKor() > 100 || ob.getKor() < 0) || (ob.getEng() > 100 || ob.getEng() < 0) || (ob.getMat() > 100 || ob.getMat() < 0)) {
			return "입력값에 오류가 있습니다";
		}
		else {
			view.insertStudent(dao.insertStudent(ob), ob.getName());
			return "";
		}
	}
	
	public void deleteStudent(String name) {
		view.deleteStudent(dao.deleteStudent(name), name);
	}
}
