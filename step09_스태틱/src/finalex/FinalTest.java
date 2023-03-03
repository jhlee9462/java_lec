package finalex;

// 상수화

class A {
	final int n = 100; // 변수 n 이 상수
	
	final public void view(final String str) {
//		n = 200; --- final 변수는 값을 변경할 수 없음
//		str = "가나다";
		System.out.println("A class");
	}
}

class B extends A {
//	@Override
//	public void view(final String str) { // final 메서드는 오버라이드 불가
//		System.out.println("B class);
//	}
}

public class FinalTest {

	public static void main(String[] args) {
		new A().view("abc");
	}

}
