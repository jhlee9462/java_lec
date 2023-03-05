package example30;

class Test36 {
	
	public Test36(int a, int b) {
		System.out.println("max : " + Math.max(a, b));
	}
	
	public Test36(double a, double b) {
		System.out.println("max : " + Math.max(a, b));
	}
	
	public Test36(char a, char b) {
		System.out.println("max : " + (char) Math.max(a, b));
	}
}

public class Ex36 {

	public static void main(String[] args) {
		new Test36(10, 20);
		new Test36(12.4, 9.45);
		new Test36('Z', 'p');
	}

}
