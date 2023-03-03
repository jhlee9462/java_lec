package ex6;

class Calc {
	public int calculate(int data) {
		int sum = 0;
		
		System.out.print("짝수: ");
		for (int i = 1; i <= data; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		
		return sum;
	}
}

public class Test02 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		System.out.println("결과: " + calc.calculate(Integer.parseInt(args[0])));
		
	}
	
}
