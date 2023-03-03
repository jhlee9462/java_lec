package tv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 다형성을 이용하여 결합도를 낮춘다.
public class TvUser {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Tv tv = null;
		System.out.print("회사이름을 입력하세요 : ");
		String com = br.readLine();
		
		if (com.equals("LG") || com.equals("lg")) {
			// .equals() 객체 비교
			tv = new LgTv();
		} else if (com.equals("Samsung")) {
			tv = new SamsungTv();
		}
		
		try {
			tv.turnOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.turnOff();
		} catch (Exception e) {
			System.out.println("어디 회사 제품이에요?");
		}
		
	}
	
}
