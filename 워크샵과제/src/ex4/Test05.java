package ex4;

class Student {
	private String name;
	private int korean, english, math, science;
	
	public Student() {
	}
	
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		return (korean + english + math + science) / 4.0;
	}
	
	public String getGrade() {
		String grade = "";
		double avg = getAvg();
		
		if (avg <= 100 && avg >= 90)
			grade = "A학점";
		else if (avg >= 70)
			grade = "B학점";
		else if (avg >= 50)
			grade = "C학점";
		else if (avg >= 30)
			grade = "D학점";
		else
			grade = "F학점";
		
		return grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		
		Student[] students = { new Student("Kim", 100, 90, 95, 89), new Student("Lee", 60, 70, 99, 98), new Student("Park", 68, 86, 60, 40) };
		
		for (Student student : students) {
			System.out.println(student.getName() + " 평균: " + student.getAvg() + " 학점: " + student.getGrade());
		}
	}

}
