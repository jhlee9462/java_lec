package switchex;

/* 문제.
 * 숫자를 입력하세요 : 5
 * 
 * 5 는 홀수입니다
 * 
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SwitchEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.println("숫자를 입력하세요 : ");
		num = Integer.parseInt(br.readLine());

		// 계산, 결과출력 -- switch
		switch (num % 2) {
		case 1:
			System.out.println(num + " 는 홀수입니다");
			break;
			
		default:
			System.out.println(num + " 는 짝수입니다");
			break;
		}
	}

}
