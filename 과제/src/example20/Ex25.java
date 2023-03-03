package example20;

public class Ex25 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);
		
		System.out.println("더하기: " + sum(x, y));
		System.out.println("빼기: " + sub(x, y));
		System.out.println("곱하기: " + multi(x, y));
		System.out.printf("나누기: %.2f\n", divi(x, y));
	}
	
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}
	
	public static int multi(int x, int y) {
		return x * y;
	}
	
	public static double divi(int x, int y) {
		return (double) x / y;
	}
	
}
