package ifex;

public class IfEx1 {

	public static void main(String[] args) {

		int score = 85;
		char grade = '\0'; // 초기화 생략 불가

		if (score >= 90 && score <= 100)
			grade = 'A';
		if (score >= 80 && score < 90)
			grade = 'B';
		if (score >= 70 && score < 80)
			grade = 'C';
		if (score >= 60 && score < 70)
			grade = 'D';
		if (score >= 0 && score < 60)
			grade = 'F';

		System.out.println("점수는 " + score + "점이고 학점은 " + grade + "입니다");

//		if ~ else if ~ else 문 -------------------------------
//
//		int score = 85;
//		char grade;
//
//		if (score >= 90)
//			grade = 'A';
//		else if (score >= 80)
//			grade = 'B';
//		else if (score >= 70)
//			grade = 'C';
//		else if (score >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
//		
//		System.out.println("점수는 " + score + "점이고 학점은 " + grade + "입니다");
//
//		if ~ else 문 ------------------------------------------
//		
//		int score = 57;
//		
//		if (score >= 60) {
//			System.out.println("합격");
//			System.out.println("점수는 " + score + "점입니다.");
//		} else {
//			System.out.println("불합격");
//			System.out.println("점수는 " + score + "점이고 다음기회에...");
//		}
//		
//		단순 if 문 ---------------------------------------------
//		String str = "helloo";
//
//		if (str == "hello") { // if (expression)
//			System.out.print("헬로우"); // 문장 1 statement
//			System.out.println(" Java"); // 문장 2
//		}
//
//		if (str == "hello") 
//			System.out.print("헬로우");
//		System.out.println(" Java"); // 무조건 동작
	}

}
