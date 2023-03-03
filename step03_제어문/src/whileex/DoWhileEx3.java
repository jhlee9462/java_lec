package whileex;

// 65 ~ 90 사이의 임의의 난수 10 개 생성

public class DoWhileEx3 {

	public static void main(String[] args) {

		int num;
		int cnt = 0;
		
		do {
			// 코드를 완성해주세요
			num = (int) (Math.random() * 26 + 65);
			System.out.print(num + " ");
			cnt++;
			
		} while (cnt < 10);
	}

}
