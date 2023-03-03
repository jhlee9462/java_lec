package ex12;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {

		String str = "I am second to none";
		StringTokenizer st = new StringTokenizer(str);
		int word = 0;
		int cha = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				continue;
			System.out.print(str.charAt(i) + " ");
			cha++;
		}
		System.out.println("문자개수: " + cha);
		
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
			word++;
		}
		System.out.println("단어개수: " + word);
	}

}
