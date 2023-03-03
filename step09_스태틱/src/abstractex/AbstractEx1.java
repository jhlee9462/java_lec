package abstractex;

// abstract class (미완성 클래스)
// abstract method 가 없어도 abstract class 는 만들 수 있음
abstract class A {

	public void view1() {
		System.out.println("view1");
	}

	public void view2() {
		System.out.println("view2");
	}
}

class B extends A {
	@Override
	public void view1() {
		System.out.println("view11");
	}
	// A 클래스의 view1() 을 재정의(오버라이드) --- 강제성이 없음
}

public class AbstractEx1 {

	public static void main(String[] args) {

//		A ob1 = new A(); // 객체 생성 불가능
		
		A ob2 = new B(); // 객체 생성 가능
		ob2.view1();
		ob2.view2();
		
	}

}

// abstract class (미완성 클래스)
//abstract class A {
//
//	abstract public void view1();
//
//	public void view2() {
//		System.out.println("view2");
//	}
//}
//
//class B extends A {
//	@Override
//	public void view1() {
//		System.out.println("view11");
//	}
//	// A 클래스의 view1() 을 재정의(오버라이드) --- 강제성이 있음
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
////		A ob1 = new A(); // 객체 생성 불가능
////		ob1.view1();
////		ob1.view2();
//
//		A ob2 = new B(); // 객체 생성 가능
//		ob2.view1();
//		ob2.view2();
//		
//	}
//
//}

// 일반 클래스
//class A {
//	public void view1() {
//		System.out.println("view1");
//	}
//	public void view2() {
//		System.out.println("view2");
//	}
//}
//
//class B extends A {
//	@Override
//	public void view1() {
//		System.out.println("view11");
//	}
//	// A 클래스의 view1() 을 재정의(오버라이드) --- 강제성이 없음
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		A ob1 = new A(); // 객체 생성 가능
//		ob1.view1();
//		ob1.view2();
//		
//		A ob2 = new B(); // 객체 생성 가능
//		ob2.view1();
//		ob2.view2();
//	}
//
//}
