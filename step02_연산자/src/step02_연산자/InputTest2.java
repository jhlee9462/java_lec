package step02_연산자;

/* 문제.
 * 
 * A 값을 입력하세요 : 15
 * B 값을 입력하세요 : 10
 * 
 * 15 + 10 = 25
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) throws IOException {
//		InputStreamReader sr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(sr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A, B;

		System.out.println("A 값을 입력하세요 : ");
		A = Integer.parseInt(br.readLine());
		System.out.println("B 값을 입력하세요 : ");
		B = Integer.parseInt(br.readLine());

		System.out.println(A + " + " + B + " = " + (A + B));
	}

}
