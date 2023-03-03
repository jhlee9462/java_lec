package ex6;

public class Test03 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = Integer.parseInt(args[0]); i <= 10; i++) {
			
			if (i % 3 == 0 || i % 5 == 0)
				continue;
			
			if (sum != 0)
				System.out.print("+ ");
			
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		
		System.out.println("결과 : " + sum);
		
	}

}
