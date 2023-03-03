package inputex;
/* BufferedReader 을 이용하여 입력 받은 후 출력하세요
 * 
 * 사원번호를 입력하세요 : 102
 * 사원이름을 입력하세요 : 이순신
 * 부서코드를 입력하세요 : B
 * 입사성적을 입력하세요 : 90.54
 * 
 * printf() 를 사용해서 출력하세요
 * 
 * -- 출력 결과 -- 
 * 사원번호 : 102
 * 사원이름 : 이순신
 * 부서코드 : B
 * 입사성적 : 90.54
 * 
 * 출력문은 println()
 * 입사성적은 소숫점 2째자리까지 출력 (printf() or String.format())
 * 
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eno;
		String name;
		char dept;
		double score;
		
		System.out.print("사원번호를 입력하세요 : ");
		eno = Integer.parseInt(br.readLine());
		
		System.out.print("사원이름을 입력하세요 : ");
		name = br.readLine();
		
		System.out.print("부서코드를 입력하세요 : ");
		dept = br.readLine().charAt(0);
		
		System.out.print("입사성적을 입력하세요 : ");
		score = Double.parseDouble(br.readLine());
		
		System.out.println("사원번호 : " + eno);
		System.out.println("사원이름 : " + name);
		System.out.println("부서코드 : " + dept);
		System.out.println(String.format("입사성적 : %.2f", score));
	}

}
