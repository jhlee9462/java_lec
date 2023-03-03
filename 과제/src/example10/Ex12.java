package example10;

public class Ex12 {

	public static void main(String[] args) {
		int midTerm = Integer.parseInt(args[0]);
		int finalTest = Integer.parseInt(args[1]);
		int report = Integer.parseInt(args[2]);
		int attendence = Integer.parseInt(args[3]);
		
		double result = (midTerm + finalTest) / 2.0 * 0.6 + report * 0.2 + attendence * 0.2;
		char grade;
		
		if (result >= 90) {
			grade = 'A';
		} else if (result >= 80) {
			grade = 'B';
		} else if (result >= 70) {
			grade = 'C';
		} else if (result >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		String evaluation;
		
		switch (grade) {
		case 'A':
		case 'B':
			evaluation = "excellent";
			break;
		case 'C':
		case 'D':
			evaluation = "good";
			break;
		default:
			evaluation = "poor";
			break;
		}
		
		System.out.println("중간고사 : " + midTerm);
		System.out.println("기말고사 : " + finalTest);
		System.out.println("과제점수 : " + report);
		System.out.println("출석점수 : " + attendence);
		System.out.println();
		System.out.printf("성적 = %.2f\n", result);
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + evaluation);
		
	}

}
