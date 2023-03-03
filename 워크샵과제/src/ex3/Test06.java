package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		
		System.out.print("입력 : ");
		n = Integer.parseInt(br.readLine());
		
		int total = 0;
		for (int i = n; i != 101; i++) { // n 부터 시작해서 낭비하는 동작이 없도록
			if (i % n == 0) {
				System.out.print(i);
				total += i;
				
				if (i + n > 100) {
					System.out.print(" = ");
				} else {
					System.out.print("+");
				}
			}
		}
		
		System.out.println(total);
	}

}
