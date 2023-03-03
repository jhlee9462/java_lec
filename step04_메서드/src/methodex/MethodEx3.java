package methodex;

// call by value : 값에 의한 호출, 매개변수에 값을 전달

public class MethodEx3 {

	public static void show1(int a, char b, double c, float d) {
		System.out.println(a + " " + b + " " + c + " " + d);
	}

	public static int show2(int k, int e, int m) {
		return k + e + m;
	}

	public static double show3(int k, int e, int m) {
		return (double) (k + e + m) / 3;
	}
	
	public static String show4(int k, int e, int m) {
		double avg = (double) (k + e + m) / 3;
		if (avg >= 60)
			return "합격";
		else
			return "불합격";
	}

	public static void main(String[] args) {
		show1(10, 'A', 10.5, 100.3f);

		int sum = show2(95, 85, 73);
		System.out.println("총점 : " + sum);

		double avg = show3(95, 85, 73);
		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f\n", avg);
		
		String result = show4(95, 85, 73);
		System.out.println("결과 : " + result);
	}

}
