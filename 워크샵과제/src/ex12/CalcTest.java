package ex12;

public class CalcTest {

	public static void main(String[] args) {

		int a = 0, b = 0;
		char c ='\0';
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[2]);
			c = args[1].charAt(0);
			if (args.length > 3)
				throw new ArrayIndexOutOfBoundsException();
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("다시 입력 하세요");
			System.exit(1);
		}
		
		Calculator calc = new Calculator();
		double result = 0;
		
		switch (c) {
		case '+':
			result = calc.plus(a, b);
			break;
		case '-':
			result = calc.minus(a, b);
			break;
		case 'x':
			result = calc.multiplication(a, b);
			break;
		case '/':
			result = calc.divide(a, b);
			break;
		}
		
		System.out.println("결과 : " + result);
	}

}
