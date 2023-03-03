package example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11 {

	public static void main(String[] args) throws IOException {

		int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("연산자를 입력(+,-,*,/) : ");
		char operator = br.readLine().charAt(0);
		
		if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
			System.out.println("연산자error");
		} else {
			switch (operator) {
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case '*':
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case '/':
				System.out.printf("%d / %d = %.2f\n", num1, num2, (double) num1 / num2);
				break;
			}
		}

	}

}
