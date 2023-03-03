package forex;
/* 문제.
 * 1 ~ 100 사이의 정수 중 7의 배수만 출력 , continue 를 사용하세요
 * 7 14 21 ... 98
 */
public class ForEx4 {

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {
			if (i % 7 != 0) 
				continue;
			System.out.print(i + " ");
		}
	}

}
