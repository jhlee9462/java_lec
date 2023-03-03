package methodex;

public class MethodEx4 {

	public static int total(int k, int e, int m) {
		return k + e + m;
	}

	public static double avg(int total) {
		return total / 3.0;
	}

	public static char grade(double avg) {
		switch ((int) avg / 10) { // 84.333333... --> 84 --> 8
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}
	
	public static String result(char grade) {
		if (grade == 'F')
			return "불합격";
		else
			return "합격";
	}

	public static void main(String[] args) {
		int k = 95, e = 85, m = 73;
		System.out.println("총점 : " + total(k, e, m) + "점");
		System.out.printf("평균 : %.2f점\n", avg(total(k, e, m)));
		System.out.println("학점 : " + grade(avg(total(k, e, m))));
		System.out.println("결과 : " + result(grade(avg(total(k, e, m)))));
		// F 학점인 경우 "불합격", 나머지는 "합격"
		
	}

}
