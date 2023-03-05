package ex7;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = {

				{ 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 }, { 45, 26, 72, 23, 34 } };
		double total = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
			}
		}
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + total / (array.length * array[0].length));
	}

}
