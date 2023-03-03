package example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan;
		
		System.out.println("단을 입력하시오: ");
		dan = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + "= " + (dan * i) + "\t\t"
					+ (dan + 1) + " * " + i + "= " + ((dan + 1) * i));
		}
		
	}

}
