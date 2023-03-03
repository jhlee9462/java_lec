package tv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 결합도가 높은 코드
public class TvUser {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("회사이름을 입력하세요 : ");
		String com = br.readLine();
		
		if (com.equals("LG") || com.equals("lg")) {
			// .equals() 객체 비교
			LgTv tv = new LgTv();
			tv.powerOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.powerOff();
		} else if (com.equals("Samsung")) {
			SamsungTv tv = new SamsungTv();
			tv.turnOn();
			tv.soundUp();
			tv.soundDown();
			tv.turnOff();
		} else {
			System.out.println("어디 회사 제품이에요?");
		}
	}
	
}
