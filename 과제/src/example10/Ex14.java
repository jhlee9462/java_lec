package example10;

public class Ex14 {

	public static void main(String[] args) {
		
		int i = 0;
		int total = 0;
		int lineCount = 0;
		
		while (i < 50) {
			if (lineCount >= 6) {
				System.out.println();
				lineCount = 0;
			}
			int randomNum = (int) (Math.random() * 101);
			System.out.print(randomNum + "\t");
			
			total += randomNum;
			++i;
			++lineCount;
		}
		
		System.out.println("\n합=" + total);
	}

}
