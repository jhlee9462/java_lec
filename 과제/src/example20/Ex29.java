package example20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex29 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] name = new String[3];
		int[] age = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("이름을 입력하시오 : ");
			name[i] = br.readLine();
			System.out.print("나이를 입력하시오 : ");
			age[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(name[i] + "\t" + age[i] + "세");
		}
	}

}
