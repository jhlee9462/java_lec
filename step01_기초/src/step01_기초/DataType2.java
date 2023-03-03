package step01_기초;

/* Systme.out.printf("메세지 or 제어문자", 변수 1, 변수 2);
 * ** 제어문자 **
 * %s String 문자열
 * %d int 정수, char 문자
 * %c char 문자
 * %f double, float 실수값들...
 */

public class DataType2 {

	public static void main(String[] args) {
		String name = "이순신";
		String dept = "개발부";
		char gender = 'M';
		double score = 85.3;
		float tall = 183.4f;
		int age = 25;
		
//		System.out.println("이름 : " + name);
//		System.out.println("부서 : " + dept); 표현방식 1
		
		System.out.printf("이름 : %s\n", name);	//	% : 제어문자, escape code, 서식 문자
		System.out.printf("부서 : %s\n", dept);	//	표현방식 2
		
		System.out.printf("성별 : %c\n", gender);
		System.out.printf("점수 : %.2f점\n", score);
		System.out.printf("점수 : %10.1f점\n", score);	//	정수는 전체 자리값의 갯수
		System.out.printf("신장 : %-10.1fcm\n", tall);	//	양수의 경우 오른쪽 정렬, 음수는 왼쪽 정렬
		System.out.printf("나이 : %10d세\n", age);	//	d : decimal
		System.out.printf("나이 : %-10d세\n", age);	//	실수 자료형과 같이 자리수 정렬이 가능하다.
	}

}
