package methodex;

// call by name : 이름만 있는 함수
public class MethodEx1 {
	// 함수 문법
	// 접근지정자 static 리턴값의자료형 함수명() {} <=== 함수정의
	// 리턴값이 없는경우 void
	public static void view() { // <=== 함수정의
		System.out.println("hello"); // 함수 호출, 함수내부에서 함수호출가능
		return; // 제어를 호출한 곳으로 돌려줌, 생략 가능
	}
	
	public static void star() {
		System.out.println("*****");
	}
	
	// 메인함수
	public static void main(String[] args) { // <=== 함수정의
		
		view(); // 함수 호출
		star();
		view();
		star();
	}

}
