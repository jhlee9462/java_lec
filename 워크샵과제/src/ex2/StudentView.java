package ex2;

import java.util.List;

public class StudentView {

	public void viewStudent(Student st) {
		System.out.println(st.getName() + "\t" + st.getAge() + "\t" + st.getHeight() + "\t" + st.getWeight());
	}
	
	public void viewStudentList(List<Student> list) {
		list.forEach(st -> {
			System.out.println(st.getName() + "\t" + st.getAge() + "\t" + st.getHeight() + "\t" + st.getWeight());
		});
	}
}
