package access1;

import access2.AccessEx3;
import access2.AccessEx4;

// 접근지정자 public > protected > default(생략) > private

public class AccessEx1 extends AccessEx4 {
	private int x = 10, y = 20;
	
	public static void main(String[] args) {
		AccessEx1 a1 = new AccessEx1();
		System.out.println(a1.x + " " + a1.y);
		
		AccessEx2 a2 = new AccessEx2();
		System.out.println(a2.x + " " + a2.y);

		AccessEx3 a3 = new AccessEx3();
		System.out.println(a3.x + " " + a3.y);

		AccessEx4 a4 = new AccessEx4();
		System.out.println(a1.a + " " + a1.b);

	}

}
