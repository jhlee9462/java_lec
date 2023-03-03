package example30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int usrInput = 0;
		
		System.out.print("원하는 month을 입력하시오 : ");
		usrInput = Integer.parseInt(br.readLine());
		
		System.out.println(usrInput + "월은 " + month[usrInput - 1] + "일입니다.");
	}

}
