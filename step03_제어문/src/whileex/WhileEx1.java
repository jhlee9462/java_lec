package whileex;

// while (조건식) {실행문}

public class WhileEx1 {

	public static void main(String[] args) {
		
		// 10 9 8 7 6 5 4 3 2 1
		int n = 10;
		
		while (n > 0) {
			System.out.print((n--) + " ");
		}
		
		
//		-----------------------------------------
//		int n = 0;
//		
//		while (n < 5) {
//			++n; // 증감식
//			System.out.println("hello java");
//		}
//		
//		-----------------------------------------
//		byte a = 127;
//		++a;
//		System.out.println(a);
//		
//		-----------------------------------------
//		
//		int n = 0;
//		
//		while (true) {
//			++n;
//			if (n <= 5)
//				System.out.println("hello java");
//			else
//				break;
//		}
		
	}

}
