package methodex;
// call by reference : 참조에 의한 호출
public class MethodEx7 {

	public static void view1(String str) {
		System.out.println(str);
		str = "hello";
	}
	
	public static void view2(int[] num) {
		for (int i = 0; i < num.length; i++) 
			System.out.print(num[i] + " ");
		System.out.println();
		num[0] = 100;
	}
	
	public static void main(String[] args) {
		String str = "happy";
		
		view1(str);
		System.out.println(str + "--"); // happy
		
		int[] num = { 10, 20, 30, 40, 50 };
		view2(num);
		for (int x : num)
			System.out.print(x + ", "); // 100, 20, 30, 40, 50,
		System.out.println();
	}

}
