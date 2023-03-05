package ex7;

public class ExTest {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		try {
			System.out.println("결과 값: " + calc.getSum(Integer.parseInt(args[0])));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidException e) {
			System.out.println("입력 값에 오류가 있습니다.");
		}
	}

}
