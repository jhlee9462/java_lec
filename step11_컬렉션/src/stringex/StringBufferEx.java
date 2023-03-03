package stringex;

public class StringBufferEx {

	public static void main(String[] args) {

		String buf = "aaa";
		buf += "123";
		buf += "가나다";
		System.out.println(buf);
		
		StringBuffer st = new StringBuffer();
		st.append("bbb");
		st.append("567");
		st.append("마바사");
		System.out.println(st);
		
		System.out.println("길이 : " + st.length());
		System.out.println("용량 : " + st.capacity());
		
		st.delete(3, 6); // 6 은 exclusive
		System.out.println(st);
		
		st.reverse();
		System.out.println(st);
		
		st.trimToSize();
		st.append("123");
		st.trimToSize();
		System.out.println("길이 : " + st.length());
		System.out.println("용량 : " + st.capacity());
	}

}
