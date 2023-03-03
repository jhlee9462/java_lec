package example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score;
		System.out.println("점수입력하시오 : ");
		score = Integer.parseInt(br.readLine());
		
		if (score < 0 || score > 100)
			System.out.println("입력오류!!");
		else
			System.out.println("입력된값 : " + score);
	}

}
