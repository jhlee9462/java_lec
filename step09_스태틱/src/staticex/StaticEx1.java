package staticex;

// 인스턴스 변수와 관련된 작업을 하는 메서드는 인스턴스 메서드
// static 변수와 관련된 작업을 하는 메서드는 클래스 메서드 혹은 static 메서드
class Test {
	int x, y; // 객체가 생성될때 초기화
	static int z; // 프로그램이 시작될때 초기화
	
	static { // static 블록
		z = 100;
		System.out.println("static 초기화 영역");
	}
	
	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("객체 초기화 영역");
	}
	
	public Test(int x, int y, int z1) {
		this.x = x;
		this.y = y;
		z = z1;
		System.out.println("객체 초기화 영역");
	}
	
	public void view() {
		System.out.println(x + " " + y + " " + z);
	}
}

public class StaticEx1 {

	public static void main(String[] args) {
//		new Test().view();
		Test ob1 = new Test(1, 2, 3);
		
		Test ob2 = new Test(4, 5, 6);
		ob1.view();
		ob2.view();
	}

}
