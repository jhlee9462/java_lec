package step01_기초;
/* 문제. 다음과 같이 완성하세요 println()사용
 * 		각각 변수를 만들어서 값을 대입한 후 결과를 출력하세요
 * 		(이름, 성별, 점수)
 * 
 * -- 출력결과 --
 * 이름은 강호동이며 성별은 남자이며
 * 점수는 85.35점입니다
 */
public class Test1 {

	public static void main(String[] args) {
		String name = "강호동";
		String gender = "남자";
		double score = 85.35;
		
		System.out.println("이름은 " + name + "이며 성별은 " + gender + "이며\n"
				+ "점수는 " + score + "점입니다");
	}

}
