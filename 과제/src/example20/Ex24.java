package example20;

public class Ex24 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
