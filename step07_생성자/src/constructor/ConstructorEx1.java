package constructor;

public class ConstructorEx1 {
	// 생성자 : 객체 생성을 담당
	public ConstructorEx1() {
		System.out.println("default constructor");
	}
	
	public ConstructorEx1(String str) {
		System.out.println(str + " constructor");
	}
	
	public ConstructorEx1(String str, int n) {
		System.out.println(str + " " + n + " constructor");
	}
	
	public static void main(String[] args) {
		new ConstructorEx1();
		new ConstructorEx1("가나다");
		new ConstructorEx1("가나다", 10);
	}

}
