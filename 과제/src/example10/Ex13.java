package example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		
		System.out.println("연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println("윤년");
		else
			System.out.println("평년");
	}

}
