package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// checked exception : 명시적 예외처리가 필요함
public class ExceptionEx3 {

	String str;
	
	public ExceptionEx3() {
		input();
	}
	
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열을 입력하세요 : ");
		
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void output() {
		System.out.println("결과 : " + str);
	}
	
	public static void main(String[] args) {
		new ExceptionEx3().output();
	}

}
