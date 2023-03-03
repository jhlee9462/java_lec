package chapter11;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		// 방법1 (split() 메서드 이용)
		String[] strings = str.split(",");
		for (String string : strings) {
			System.out.println(string);
		}
		
		System.out.println();
		
		// 방법2 (StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str, ",");
		for (int i = 0; i != 3; i++) {
			System.out.println(st.nextToken());
		}
	}

}
