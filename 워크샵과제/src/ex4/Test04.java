package ex4;

class Calc {
	public int calcSum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}

public class Test04 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int sum = calc.calcSum(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		double avg = sum / 4.0;
		char grade = '\0';
		
		if (avg <= 100 && avg >= 90) {
			grade = 'A';
		} else if (avg >= 70) {
			grade = 'B';
		} else if (avg >= 50) {
			grade = 'C';
		} else if (avg >= 30) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("Sum:" + sum);
		System.out.printf("Avg:%.2f\n", avg);
		System.out.println(grade + "학점");
		
	}
	
}
