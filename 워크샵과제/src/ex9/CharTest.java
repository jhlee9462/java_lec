package ex9;

public class CharTest {

	public static void main(String[] args) {
		char[] str = args[0].toUpperCase().toCharArray();
		for (int i = str.length - 1; i >= 0; i--)
			System.out.print(str[i]);
	}

}
