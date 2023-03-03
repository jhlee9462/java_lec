package inputex;
/* Argument 을 이용하여 입력 받은 후 출력하세요
 * 
 * $ java InputTest7 103 뽀로로 C 75.3
 * 
 * -- 출력 결과 -- 
 * 사원번호 : 103
 * 사원이름 : 뽀로로
 * 부서코드 : C
 * 입사성적 : 75.3
 * 
 * 출력문은 printf() 를 한 번 사용하여 전부 출력하세요
 * 
 */

public class InputTest7 {

	public static void main(String[] args) {
		
		int eno = Integer.parseInt(args[0]);
		String name = args[1];
		char dept = args[2].charAt(0);
		double score = Double.parseDouble(args[3]);
		
		System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 : %.1f\n", eno, name, dept, score);
	}

}
