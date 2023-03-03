package step01_기초;
/*
 *  문제. 각각의 변수를 만들어서 다음과 같이 완성하세요
 *  
 *  float 자료형의 변수에 75.3
 *  double 자료형의 변수에 89.53을 각각 대입한 후
 *  System.out.print() 함수를 1 회 사용하여 출력하세요
 *  
 *  -- 출력 결과 --
 *  국어점수는 75.3점이고
 *  수학점수는 89.53점입니다
 *  
 */
public class Test3 {

	public static void main(String[] args) {
		float korean = 75.3f;
		double math = 89.53;
		
		System.out.print("국어점수는 " + korean + "점이고\n"
				+ "수학점수는 " + math + "점입니다");
		// println() 은 출력 후 줄바꿈 발생
		// print() 는 출력 후 줄바꿈 없음
		// printf() 는 출력 후 줄바꿈 없음
	}

}
