package chapter5;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for (int e : array) {
			if (e > max)
				max = e;
		}
		
		System.out.println("max : " + max);
	}

}
