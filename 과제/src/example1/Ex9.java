package example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char inputChar;
		System.out.println("Input Character : ");
		inputChar = br.readLine().charAt(0);
		
		if (inputChar >= 'a' && inputChar <= 'z')
			System.out.println((char) (inputChar - 32));
		else if (inputChar >= 'A' && inputChar <= 'Z')
			System.out.println((char) (inputChar + 32));
		else
			System.out.println("입력데이터 오류");
		
	}

}
