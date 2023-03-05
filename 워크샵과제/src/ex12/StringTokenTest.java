package ex12;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {

		String str = "4,2,3,6,7";
		StringTokenizer st = new StringTokenizer(str, ",");
		int total = 0;
		
		while (st.hasMoreTokens()) {
			total += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(total);
	}

}
