package example20;

public class Ex26 {

	public static void main(String[] args) {
		String result = personView("홍길동", 90, 78, 88);
		System.out.println(result);
	}

	public static String personView(String string, int i, int j, int k) {
		return string + "의 총점은 " + (i + j + k) + "점입니다";
	}

}
