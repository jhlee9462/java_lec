package chapter5;

import java.util.Scanner;

public class Exercies9 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
				int max = scores[0];
				int total = 0;
				double avg = 0.0;
				for (int e : scores) {
					if (e > max)
						max = e;
					total += e;
				}
				avg = (double) total / scores.length;
				System.out.println("최고 점수: " + max);
				System.out.printf("평균 점수: %.1f\n", avg);
				break;
			case 5:
				run = false;
				break;
			}

		}
		scanner.close();

		System.out.println("프로그램 종료");

	}

}
