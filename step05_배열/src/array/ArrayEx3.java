package array;
// $ java ArrayEx3 abcd 가나다 123 12345
public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("args 의 길이 : " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
			System.out.println("args[" + i + "] 의 길이 : " + args[i].length());
		}
		
		System.out.println("---------------------------------------");
		
		for (String data : args) {
			System.out.println(data);
			System.out.println(data.length() + "\n");
		}
	}

}
