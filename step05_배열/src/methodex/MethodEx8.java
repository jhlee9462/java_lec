package methodex;

public class MethodEx8 {

	public static void view1() {
		System.out.println("static method");
	}
	
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		// 클래스 메서드 (또는 static method) : 객체 없이 호출 가능.
		view1();
		MethodEx8.view1(); // 자기 자신의 메서드에 접근할때는 클래스 이름 생략가능		
//		System.out.println(Math.random());
		
		// 인스턴스 메서드 (instance method)
		// 반드시 객체를 생성한 후에 메서드를 호출할 수 있음
		MethodEx8 ob = new MethodEx8(); // 객체 생성
		ob.view2();
	}

}
