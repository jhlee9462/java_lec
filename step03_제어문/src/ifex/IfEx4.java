package ifex;
/* 문제. 중첩 if 를 이용하여 프로그램을 작성하세요
 * 3 개 과목의 점수를 입력 받아서 합격인지 불합격인지 출력하세요
 * 3 개 과목이 전부 40 점 이상이어야 하고 평균이 60 이상이면 "합격"
 * 평균이 60 이 넘지만 1 개 과목이라도 40 점 미만이면 "과락으로 불합격"
 * 평균이 60 미만이면 "불합격"
 * 
 * -- 출력결과 --
 * 국어점수입력 : 95
 * 영어점수입력 : 85
 * 수학점수입력 : 73
 * 결과 : 합격
 * 
 * 국어점수입력 : 35
 * 영어점수입력 : 85
 * 수학점수입력 : 73
 * 결과 : 과락으로 불합격
 * 
 * 국어점수입력 : 45
 * 영어점수입력 : 55
 * 수학점수입력 : 22
 * 결과 : 불합격
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IfEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int korean, english, math;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("국어점수입력 : ");
		korean = Integer.parseInt(br.readLine());
		System.out.println("영어점수입력 : ");
		english = Integer.parseInt(br.readLine());
		System.out.println("수학점수입력 : ");
		math = Integer.parseInt(br.readLine());
		
		double avg = (korean + english + math) / 3;
		
		System.out.print("결과 : ");
		
//		if (avg < 60)
//			System.out.println("불합격");
//		else {
//			if (korean < 40 || english < 40 || math < 40)
//				System.out.println("과락으로 불합격");
//			else
//				System.out.println("합격");
//		} 방식 1
		
		if (avg >= 60) {
			if (korean >= 40 && english >=40 && math >= 40)
				System.out.println("합격");
			else
				System.out.println("과락으로 불합격");
		} else
			System.out.println("불합격");
	} // 방식 2

}
