package example20;

public class Ex21 {

	public static void main(String[] args) {
		int odd = 0, even = 0;
		int[] num = { 1, 5, 2, 7, 3, 9, 10, 4, 6, 8 };
		
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				even += num[i];
			} else {
				odd += num[i];
			}
		}
		
		System.out.println("홀수방의 합= " + odd);
		System.out.println("짝수방의 합= " + even);
	}

}
