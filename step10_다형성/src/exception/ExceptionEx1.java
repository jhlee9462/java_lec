package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int var = 5;
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(var / n);
		} catch (Exception e) {
			System.out.println("입력된 값에 오류가 있습니다.");
		}

//		-------------------------------------------------------
		/*
		 * $java ExceptionEx1 2 ==> 2 $java ExceptionEx1 0 ==> 0으로 나눌 수 없습니다. $java
		 * ExceptionEx1 a ==> 숫자로 바꿀 수 없습니다. $java ExceptionEx1 ==> 입력된 값이 없습니다.
		 */

//		try {
//			int n = Integer.parseInt(args[0]);
//			System.out.println(var / n);
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 바꿀 수 없습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("입력된 값이 없습니다.");
//		} finally {
//			System.out.println("***** 무조건 실행됨 *****");
//		}
//		
		System.out.println("정상 진행중...");
	}

}
