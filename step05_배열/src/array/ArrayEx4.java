package array;
/* args 로 세 수를 입력 받아서 최대값, 최소값을 출력
 * 
 * $ java ArrayEx4 10 15 23
 * 
 * 최대값 : 23
 * 최소값 : 10
 */
public class ArrayEx4 {

	public static void main(String[] args) {
		
		int[] num = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
		}
		
		int max = num[0], min = num[0];
		
		for (int e : num) {
			if (e > max)
				max = e;
			if (e < min)
				min = e;
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
