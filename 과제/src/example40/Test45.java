package example40;

import java.util.Scanner;

public class Test45 extends Height {

	@Override
	public double getInch(double cm) {
		return cm / INCH;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(cm)를 입력하시오 : ");
		double cm = sc.nextDouble();
		
		double inch = new Test45().getInch(cm);
		
		System.out.println(cm + "cm는 " + String.format("%.0f", inch) + "인치입니다");
		
		sc.close();
	}

}
