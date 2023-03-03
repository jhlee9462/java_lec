package chapter11;

public class StringBuilderExamplev {

	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i != 100; i++) {
			str += (i + 1);
		}
		System.out.println(str);
		
		// 개선 코드 작성 위치
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i != 100; i++) {
			stringBuilder.append(i + 1);
		}
		System.out.println(stringBuilder);
	}
	
}
