package step01_기초;

/* 콘솔 : 표준 입출력 장치
 * 표준입력장치 : 키보드
 * 표준출력장치 : 모니터
 */

public class DataType1 {

	public static void main(String[] args) {
		
		String name = "홍길동"; // 문자열은 "" 안에 작성
		int age = 24; // 정수 자료형 4 byte
		char gender = '남'; // 하나의 문자는 '' 안에 작성, 2byte
		float weight = 63.5f; // float 는 4 byte 실수 자료형이고 8 byte 실수 자료형과 구분하기 위해 끝에 f 를 붙여준다.
		double tall = 175.5; // 8 byte 실수 자료형, 최근에는 메모리가 상대적으로 풍부하기 때문에 보통 double 형을 쓴다.
		
		System.out.println("이름 : " + name + "\n"
					+ "나이 : " + age + "세\n"
					+ "성별 : " + gender + "\n"
					+ "체중 : " + weight + "kg\n"
					+ "신장 : " + tall + "cm");
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender);
		System.out.println("체중 : " + weight + "kg");
		System.out.println("신장 : " + tall + "cm");
		
//		System.out.println("이름 : 홍길동");
//		System.out.println("나이 : 23세");
//		System.out.println("성별 : 남");
//		System.out.println("체중 : 63.4kg");
//		System.out.println("신장 : 175.5cm");
	}

}
