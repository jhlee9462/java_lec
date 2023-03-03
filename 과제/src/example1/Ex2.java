package example1;

public class Ex2 {

	public static void main(String[] args) {
		int money = 65430;
		System.out.println("만원 = " + (money / 10000));
		money %= 10000;
		System.out.println("천원 = " + (money / 1000));
		money %= 1000;
		System.out.println("백원 = " + (money / 100));
		money %= 100;
		System.out.println("십원 = " + (money / 10));
		money %= 10;
	}

}
