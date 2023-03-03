package ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student("민들레", 15, 170, 55);
		Student st2 = new Student("진달래", 22, 165, 53);
		Student st3 = new Student("개나리", 20, 155, 46);

		StudentView sv = new StudentView();
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("-------------------------------");
		
		sv.viewStudent(st1);
		
		System.out.println();
		System.out.println();
		
		sv.viewStudentList(students);

	}
}