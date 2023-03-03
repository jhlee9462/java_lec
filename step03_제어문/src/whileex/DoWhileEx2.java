package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제. do-while 을 이용하여 반복처리를 하세요
 * 
 * 다시 실행할까요?(y/Y) : Y
 * 다시 실행할까요?(y/Y) : y
 * 다시 실행할까요?(y/Y) :
 * ***** 수고하셨습니다 *****
 */
public class DoWhileEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char usrInput;
		// 조건을 만족할 동안 do-while 범위 안의 코드를 동작
		do {
			System.out.println("다시 실행할까요?(y/Y) : ");
			try {
				usrInput = br.readLine().charAt(0);	
			} catch (Exception e) {
				usrInput = 'a';
			}
		} while (usrInput == 'y' || usrInput == 'Y');
		
		System.out.println("***** 수고하셨습니다 *****");
		
	}

}
