package ex4;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int total = 0;
		
		for (int i = 0; i != arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println("sum=" + total);
		System.out.println("avg=" + total / arr.length);
	}

}
