package example30;

class SuperEx {
	int x, y, z;
	
	public SuperEx() {
		System.out.println("**** x,y,z에 값채우기***");
	}
	
	public SuperEx(int k) {
		this();
		this.x = k;
		System.out.println(k + "을 넘겨받은 생성자");
	}
	
	public SuperEx(int a, int b) {
		this(a);
		this.y = b;
		System.out.println(a + "  " + b + "  을 넘겨받은 생성자");
	}
	
	public SuperEx(int x, int y, int z) {
		this(x, y);
		this.z = z;
		System.out.println(x + "  " + y + "  " + z + "  을 넘겨받은 생성자");
	}
	
	public void display() {
		System.out.println(this.x + "  " + this.y + "  " + this.z);
	}
}

class SubEx extends SuperEx {
	public SubEx(int a, int b, int c) {
		super(a, b, c);
		
		super.display();
		this.sumData();
	}
	
	public void sumData() {
		System.out.println("합 : " + (x + y + z));
	}
}

public class Ex39 {

	public static void main(String[] args) {
		new SubEx(10, 20, 30);
	}

}
