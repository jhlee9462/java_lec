package forex;

// for (초기값; 조건식; 증감식) { 처리할 내용 }
public class ForEx1 {

	public static void main(String[] args) {

		// 문제.
		// 100 97 94 ... 82
		
		for (int i = 100; i >= 82; i -= 3) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n");
		
		// A B C ... Z
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
			
//		int sum = 0;
//		int odd = 0;
//		int even = 0;
//		
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//			switch (i % 2) {
//			case 1:
//				odd += i;
//				break;
//			default:
//				even += i;
//				break;
//			}
//		}
//		
//		System.out.println("1 ~ 100 까지의 합 : " + sum);
//		
//		System.out.println("1 ~ 100 까지의 홀수합 : " + odd);
//		System.out.println("1 ~ 100 까지의 짝수합 : " + even);
	}

}
