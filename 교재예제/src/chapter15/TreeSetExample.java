package chapter15;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student(96, "blue"));
		treeSet.add(new Student(86, "hong"));
		treeSet.add(new Student(92, "white"));
		
		Student student = treeSet.last();
		System.out.println("최고점수: " + student.studentNum);
		System.out.println("최고점수를 받은 아이디: " + student.name);
	}

}
