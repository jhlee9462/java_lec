package stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
//		String str = "학교,집,학원,게임방,술집,도서관";
//		String[] value = str.split(",");
//		
//		for (String x : value) {
//			System.out.println(x);
//		}
//		
//		---------------------------------------------
		
		String str = "학교,#집$,학원,게임방@,술집,도서관";
		
		StringTokenizer tokens = new StringTokenizer(str, ",#$@"); // delimeter : ,#$@
		System.out.println("파싱할 문자열의 수 : " + tokens.countTokens());
		while (tokens.hasMoreElements())
			System.out.println(tokens.nextElement());
	}

}
