package methodex;

public class MethodEx5 {

	public static void show1() { // call by name
		System.out.println("안녕하세요");
	}
	
	public static void show2(char type, int code) { // call by value
		System.out.println("타입 : " + type);
		System.out.println("코드 : " + code);
	}
	
	public static String show3() {
		return "hello";
	}
	
	public static float show4(int k, int e, int m) {
		return (k + e + m) / 3.0f;
	}
	
	public static void main(String[] args) {
		
		show1();
		show2('A', 25);
		
		String s = show3();
		System.out.println("리턴값 : " + s);
		
		float k = show4(95, 85, 73);
		System.out.printf("리턴값 : %.2f\n", k);
	}

}
