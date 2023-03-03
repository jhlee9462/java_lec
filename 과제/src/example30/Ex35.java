package example30;

import java.util.Scanner;

class Circle {
	private int r;
	final private double PI = 3.141592;
	
	public Circle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하시오 : ");
		r = sc.nextInt();
		sc.close();
	}
	
	public double process() {
		return r * r * PI;
	}
	
	public void output() {
		System.out.printf("원의 넓이 : %.1f\n", process());
	}
}

public class Ex35 {

	public static void main(String[] args) {
		Circle ob = new Circle();
		ob.output();
	}

}
