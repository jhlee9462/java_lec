package step03_제어문;

// 난수 함수 : 컴퓨터가 임의의 숫자를 발생 (pseudo random)
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// Math 클래스를 이용하는 방법
		System.out.println(Math.random()); // 0.0 ~ 0.99999999999999...
		System.out.println((int) (Math.random() * 10 + 1)); // 1 이상 11 미만
		System.out.println((int) (Math.random() * 31 + 50)); // 50 이상 81 미만
		// 문제. 51 ~ 80 사이의 난수 생성
		System.out.println((int) (Math.random() * 30 + 51)); // 51 이상 80 미만
		
		// Random 클래스를 이용하는 방법
		Random rd = new Random();
		int r1 = rd.nextInt(101) + 0; // 0 이상 101 미만
		int r2 = rd.nextInt(31) + 50; // 50 이상 81 미만
		int r3 = rd.nextInt(41) + 30; // 30 이상 71 미만
		
		System.out.println(r1 + " " + r2 + " " + r3);
	}

}
