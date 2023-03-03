package switchex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SwitchEx4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		System.out.println("이름을 입력하세요 : ");
		name = br.readLine();

		switch (name) {
		case "크롱":
			System.out.println("크롱입니다");
			break;
			
		case "뽀로로":
			System.out.println("뽀로로입니다");
			break;
			
		case "패티":
			System.out.println("패티입니다");
			break;
			
		default:
			System.out.println("누구세요?");
			break;
		}
	}

}
