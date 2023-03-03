package chapter15;

public class Student implements Comparable<Student> {

	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (student.studentNum == studentNum);
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Student o) {
		if (studentNum == o.studentNum) {
			return 0;
		} else if (studentNum < o.studentNum) {
			return -1;
		} else {
			return 1;
		}
	}
	
}
