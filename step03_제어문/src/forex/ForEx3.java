package forex;

public class ForEx3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // 행에 대한 접근
			for (int j = 1; j <= 5; j++) { // 열에 대한 접근
				System.out.print(j + " ");
			}
			System.out.println(); // 줄바꿈
		}
		
//		--------------------------------------------------
		
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
//		---------------------------------------------------
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
//		----------------------------------------------------
//		문제. 다음과 같이 출력하세요
		/*
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
