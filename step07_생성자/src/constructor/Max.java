package constructor;

import java.util.Scanner;

public class Max {
	private int a, b;
	
	public Max() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a : ");
		a = sc.nextInt();
		System.out.print("Input b : ");
		b = sc.nextInt();
		sc.close();
		System.out.println();
	}
	
	public int maxValue() {
		return a > b ? a : b;
	}
	
	public int minValue() {
		return a > b ? b : a;
	}
	
	public void show() {
		System.out.println("큰수 : " + maxValue());
		System.out.println("작은수 : " + minValue());
	}
}
