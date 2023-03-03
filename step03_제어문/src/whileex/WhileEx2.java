package whileex;
/* 문제. 단을 입력 받아서 해당하는 구구단을 출력하세요
 * 
 * 단을 입력하세요 : 7
 * 
 * -- 출력 결과 --
 * 7 * 1 = 7
 * 7 * 2 = 14
 *     :
 *     :
 * 7 * 9 = 63
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan = 0;
		
		System.out.println("단을 입력하세요 : ");
		dan = Integer.parseInt(br.readLine());
		int i = 1;
		
		while (i < 10) {
			System.out.println(dan + " * " + i + " = " + dan * (i++));
//			++i;
		}
		
	}

}
