package exception;

class MyException extends Exception {
	
	public MyException() {
		System.out.println("미성년자 출입금지\n집으로 가셔~");
	}
}

public class ExceptionEx4 {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		
		if (age < 19) {
			try {
				throw new MyException();
			} catch (Exception e) {
				
			}
		} else {
			System.out.println("*** 환영합니다 고객님 ***");
		}
	}

}
