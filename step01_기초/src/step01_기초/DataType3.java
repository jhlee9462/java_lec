package step01_기초;

/* 문제. 각각의 변수에 대입하여 출력하세요
 * 
 * 이름 : 이순신	<== println()
 * 나이 : 25세	<== print()
 * 부서 : 개발부	<== printf() 사용하여 부서, 성적 한번에 출력
 * 성적 : 87.5점
 * 
 */

public class DataType3 {

	public static void main(String[] args) {
		String name = "이순신";
		int age = 25;
		String dept = "개발부";
		double score = 87.5;

		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "세\n");
		System.out.printf("부서 : %s\n성적 : %.1f점", dept, score);
	}

}
