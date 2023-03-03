package chapter11;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		return studentNum.equals(((Student) obj).getStudentNum());
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
