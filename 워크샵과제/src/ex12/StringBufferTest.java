package ex12;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("LGCNS");
		String str = null;
		
		str = sb.replace(2, 5, "cnser").toString();
		System.out.println(str);
	}
	
}
