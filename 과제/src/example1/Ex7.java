package example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		System.out.println("a를 입력하시오 : ");
		a = Integer.parseInt(br.readLine());
		System.out.println("b를 입력하시오 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println("큰수 : " + ((a >= b) ? a : b));
	}

}
