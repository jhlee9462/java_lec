package example10;

public class Ex17 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 && i % 3 == 0) { // 7 로 나누는 것을 먼저 배치해서 검사 수를 줄인다.
				System.out.print(i + " ");
			}
		}
	}

}
