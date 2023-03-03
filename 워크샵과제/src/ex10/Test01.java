package ex10;

public class Test01 {
	
	public static void main(String[] args) {
		int data = 0;
		
		try {
			data = Integer.parseInt(args[0]);
			if (data < 5 || data > 10)
				throw new NumberFormatException();
		} catch (NumberFormatException e) {
			System.out.println("다시 입력하세요");
			System.exit(1);
		}
		
		Calc calc = new Calc();
		System.out.println("결과: " + calc.calculate(data));
	}
	
}
