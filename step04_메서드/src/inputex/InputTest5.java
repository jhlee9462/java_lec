package inputex;
/* eno : 101, name : 홍길동, dept : 'A', score : 89.5 를 대입 후 출력하세요
 * 
 * printf() 를 사용해서 출력하세요
 * 
 * -- 출력 결과 -- 
 * 사원번호 : 101
 * 사원이름 : 홍길동
 * 부서코드 : A
 * 입사성적 : 89.5
 * 
 */

public class InputTest5 {

	public static void main(String[] args) {
		
		int eno = 101;
		String name = "홍길동";
		char dept = 'A';
		double score = 89.5;
				
		System.out.printf("사원번호 : %d\n", eno);
		System.out.printf("사원이름 : %s\n", name);
		System.out.printf("부서코드 : %c\n", dept);
		System.out.printf("입사성적 : %.1f\n", score);
	}

}
