package step02_연산자;

public class OperatorEx {

	public static void main(String[] args) {

		// 변수의 초기화
		String a = null; // String a = "";
		int b = 0;
		double c = 0;
		float d = 0;
		char e = '\0'; // 묵시적으로 비어있는 값으로 초기화, 널 문자
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
		
//		// 삼항연산자 ? :
//		char code = '남';
//		String gender;
//		// 조건식 ? 조건식이 참일 때의 리턴값 : 조건식이 거짓일 때의 리턴값
//		// System.out.println(조건식 ? 조건식이 참일 때의 리턴값 : 조건식이 거짓일 때의 리턴값);
//		gender = (code == '남' || code == 'M') ? "man" : "woman";
//		
//		System.out.println(gender);
//		
//		System.out.println((code == '남' || code == 'M') ? "man" : "woman");
//		
//		// 단항연산자
//		int x = 7;
//		// x = x + 1, x = x - 1  화면  메모리
//		System.out.println(x++);// 7   8
//		System.out.println(x--);// 8   7
//		System.out.println(x);  // 7   7
//		System.out.println(++x);// 8   8
//		System.out.println(--x);// 7   7
//
//		// 대입연산자
//		int k = 7;
//		
//		k += 2; // k = k + 2;	9
//		k *= 6; // k = k * 6;	54
//		k -= 4; // 50
//		k %= 7; // 1
//		System.out.println(k);
//		
//		// 산술연산자
//		System.out.println(5 % 3); // 나머지 연산
//		System.out.println(5 / 3); // 몫 연산 (정수값이므로)
//		
//		// 관계연산자
//		int a = 5;
//		System.out.println(a == 5); // a 는 5 와 같은가? true
//		System.out.println(a >= 5); // a 는 5 와 크거나 같은가? true
//		System.out.println(a != 5); // a 는 5 와 같지 않은가? false
//		
//		// 논리연산자 and, or, not
//		String str = "hello";
//		System.out.println(str == "hello" || str == "Hello"); // true
//
//		int score = 57;
//		System.out.println(score >= 70 && score < 90); // false
//		
//		boolean ck = true;
//		System.out.println(!ck); // ! 논리 부정
//		
//		boolean sw = score >= 70 && score < 90;	//	관계연산이 논리연산보다 우선순위가 높다.
//		System.out.println(sw);
	}

}
