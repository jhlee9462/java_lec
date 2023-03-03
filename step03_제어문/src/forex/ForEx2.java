package forex;

public class ForEx2 {

	public static void main(String[] args) {

		int[] num = {101, 102 , 103, 104, 105};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
//		System.out.println(num);
		
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}
		
		// 형상된 for 문 -- foreach
		
		for (int x: num) {
			System.out.print(x + " ");
		}
		System.out.println();
		
//		------------------------------------------------
		
		String[] color = {"red", "green", "blue"};
		
		for (int n = 0; n < color.length; n++) {
			System.out.println(color[n]);
		}
		
		// 문제. color 를 형상된 for 문을 이용하여 출력하세요
		
		for (String col : color) {
			System.out.print(col + " ");
		}
		
		System.out.println("\n----------------------------");
		
		// continue, break ------------------------------
		
		for (int a = 1; a <= 10; a++) {
			if (a == 5)
				continue; // 1 2 3 4 6 7 8 9 10
//				break; // 1 2 3 4
			System.out.print(a + " ");
		}
	}

}
