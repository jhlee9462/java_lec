package step03_제어문;

/* 문제. 다음과 같이 출력하세요
 * 
 * 반지름을 입력하세요 : 5
 * 원의 넓이 : 78.5       <-- 반 * 반 * 3.14
 * 원의 둘레 : 31.4		<-- 반 * 2 * 3.14
 * 
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double radius, area, circumference;
		double pi = 3.14;
		
		System.out.println("반지름을 입력하세요 : ");
		radius = Double.parseDouble(br.readLine());
		area = radius * radius * pi;
		circumference = radius * 2 * pi;
		System.out.printf("원의 넓이 : %.1f \n", area);
		System.out.printf("원의 둘레 : %.1f", circumference);
		
	}

}
