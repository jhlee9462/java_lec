package ex6;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("다시 입력 하세요");
			System.exit(1);
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		if ((x < 1 || x > 5) && (y < 1 || y > 5)) {
			System.out.println("숫자를 확인 하세요");
			System.exit(1);
		}
		
		int[][] arr = new int[x][y];
		int sum = 0;
		
		for (int i = 0; i != x; i++) {
			for (int j = 0; j != y; j++) {
				arr[i][j] = new Random().nextInt(1, 6);
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("sum=" + sum);
		System.out.printf("avg=%.1f", (double) sum / (x * y));
	}

}
