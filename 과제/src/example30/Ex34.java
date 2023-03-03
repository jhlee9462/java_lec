package example30;

public class Ex34 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int total = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 50 + 1);
			total += num[i];
		}
		
		System.out.println("-정렬 전-");
		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "]=" + num[i] + "  ");
		}
		
		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("-정렬 후-");
		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "]=" + num[i] + "  ");
		}
		System.out.println();
		System.out.println("합 = " + total);
		
	}
	
}
