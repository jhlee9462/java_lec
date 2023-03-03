package array;

// 배열 : 동일한 자료형의 연속된 기억공간
// 1차원 배열

public class ArrayEx1 {

	public static void main(String[] args) {
		// 자료형[] 변수명 = { 값1, 값2, ..., 값n }
//		int[] num = { 100, 200, 300, 400, 500 };

		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// 역순으로 출력해주세요

		for (int i = num.length - 1; i >= 0; i--)
			System.out.println(num[i]);

		// 향상된 for 문

		for (int e : num)
			System.out.println(e);
	}

}
