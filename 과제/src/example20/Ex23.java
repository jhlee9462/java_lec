package example20;

public class Ex23 {

	public static void main(String[] args) {
		int total = 0;
		
		for (int i = 1; i <= 10; i++) {
			total += i;
			if (i == 10) 
				System.out.print(i + "=");
			else 
				System.out.print(i + "+");
		}
		System.out.println(total);
	}

}
