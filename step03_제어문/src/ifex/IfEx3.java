package ifex;
/* 문제. 다음을 작성하세요
 * a 변수에 46 또는 55 를 대입한 후
 * 
 * 1. 단순 if 를 이용
 * 		조건식에서 50 이상이면
 * 	"55 는 50 보다 크거나 같다", "46 은 50 보다 작다"
 * 
 * 2. if ~ else (a % 2 == 0)
 * 	a 변수의 값이 홀수인지 짝수인지 판단
 * 
 * 3. if ~ else if ~ else
 * 	a 변수의 값이 "양수" "음수" 또는 "zero" 인지를 출력
 * 
 * -- 출력결과 --
 * 55 는 50 보다 크거나 같다
 * 55 는 홀수입니다
 * 55 는 양수입니다
 * 
 */
public class IfEx3 {

	public static void main(String[] args) {
		
		int a = 55;
		
		if (a >= 50)
			System.out.println(a + " 는 50 보다 크거나 같다");
		if (a < 50)
			System.out.println(a + " 는 50 보다 작다");
		
		if (a % 2 == 0)
			System.out.println(a + " 는 짝수입니다");
		else
			System.out.println(a + " 는 홀수입니다");
		
		if (a > 0)
			System.out.println(a + " 는 양수입니다");
		else if (a < 0)
			System.out.println(a + " 는 음수입니다");
		else
			System.out.println(a + " 는 zero입니다");
	}

}
