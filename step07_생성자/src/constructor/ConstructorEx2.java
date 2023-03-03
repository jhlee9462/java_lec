package constructor;

/* 생성자가 여러개일때 다른 생성자의 호출이 가능
 * 이때 this 를 사용
 * 객체가 자기 자신을 참조할때 사용하는 this 는 생성자를 호출하기 위한 this() 의 형태로 사용가능하다. -- 메서드 아님
 * this() 생성자 호출은 생성자에서만 가능
 * 생성자의 맨 첫 줄에서만 사용 가능
 */

public class ConstructorEx2 {

	public ConstructorEx2() {
		System.out.println("default constructor"); // 4
	}
	
	public ConstructorEx2(int num) {
		this("가나다", num); // 2
		System.out.println(num + " constructor"); // 6
	}
	
	public ConstructorEx2(String str, int n) {
		this(); // 3
		System.out.println(str + " " + n + " constructor"); // 5
	}
	
	public static void main(String[] args) {
		new ConstructorEx2(10); // 1, 7
	}

}
//-----------------------------------------------------------------------3
//public class ConstructorEx2 {
//
//	public ConstructorEx2() {
//		this("가나다", 10); // 2
//		System.out.println("default constructor"); // 6
//	}
//	
//	public ConstructorEx2(String str) {
//		System.out.println(str + " constructor"); // 4 
//	}
//	
//	public ConstructorEx2(String str, int n) {
//		this(str); // 3
//		System.out.println(str + " " + n + " constructor"); // 5 
//	}
//	
//	public static void main(String[] args) {
//		new ConstructorEx2(); // 1, 7
//	}
//
//}
//---------------------------------------------------------------------2
//public class ConstructorEx2 {
//
//	public ConstructorEx2() {
//		System.out.println("default constructor"); 
//	}
//	
//	public ConstructorEx2(String str) {
//		this(); 
//		System.out.println(str + " constructor"); 
//	}
//	
//	public ConstructorEx2(String str, int n) {
//		this(str); 
//		System.out.println(str + " " + n + " constructor"); 
//	}
//	
//	public static void main(String[] args) {
//		new ConstructorEx2("가나다", 10); 
//	}
//
//}
//------------------------------------------------------------------------1