package 자바과제11;

import java.util.StringTokenizer;

public class Test53 {

	public static void main(String[] args) {
		String str = "10*30*20*40*50";
		StringTokenizer st = new StringTokenizer(str, "*");
		int total = 0;
		
		while (st.hasMoreTokens()) {
			String num = st.nextToken();
			total += Integer.parseInt(num);
			System.out.print(num);
			if (st.hasMoreElements())
				System.out.print("+");
			else
				System.out.print("=");
		}
		System.out.println(total);
	}

}
