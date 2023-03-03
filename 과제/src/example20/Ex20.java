package example20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x, y;
		
		System.out.println("x값을 입력하시오: ");
		x = Integer.parseInt(br.readLine());
		System.out.println("y값을 입력하시오: ");
		y = Integer.parseInt(br.readLine());
		
		int pow = 1;
		for (int i = 0; i < y; i++) {
			pow *= x;
		}
		
		System.out.println(x + "의 " + y + "승은 " + pow + "입니다");
	}

}
