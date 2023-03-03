package staticex;

class BankAccount {
	private int year;
	private String name;
	private int money;
	private static double rate;
	
	public BankAccount(int year, String name, int money, double r) {
		super();
		this.year = year;
		this.name = name;
		this.money = money;
		rate = r;
	}
	
	public static void setRate(double r) { // static 변수를 제어하기 위한 함수
		// 유효성 검사
		if (r < 0.02 || r > 0.12) {
			System.out.println("금리 확인하고 가실게요");
			System.exit(0);
		}
		
		rate = r;
	}
	
	public void view() {
		System.out.println(year + "\t" + name + "\t" + money + "\t" + rate);
	}
}

public class StaticEx2 {

	public static void main(String[] args) {
		System.out.println("***** 입금 당시의 금리 *****");
		BankAccount ba1 = new BankAccount(1990, "둘리", 1000, 0.07);
		ba1.view();
		BankAccount ba2 = new BankAccount(1998, "도우너", 1000, 0.12);
		ba2.view();
		BankAccount ba3 = new BankAccount(2005, "마이콜", 1000, 0.03);
		ba3.view();
		
		System.out.println("\n***** 2020년 현재의 금리 *****");
		ba1.view();
		ba2.view();
		ba3.view();
		
		System.out.println("\n***** 2022년 변동된 금리 *****");
		BankAccount.setRate(0.08);
		ba1.view();
		ba2.view();
		ba3.view();
		
	}

}
