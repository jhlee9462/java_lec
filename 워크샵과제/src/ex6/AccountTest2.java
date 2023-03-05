package ex6;

public class AccountTest2 {

	public static void main(String[] args) {

		Account[] accounts = new Account[5];
		for (int i = 0; i != accounts.length; i++) {
			accounts[i] = new Account("221-0101-211" + (i + 1), 100000, 0.045);
		}
		
		for (Account account : accounts) {
			account.accountInfo();
			System.out.println();
		}
		
		for (Account account : accounts) {
			account.setInterestRest(0.037);
			account.accountInfo();
			System.out.println(" 이자: " + (int) account.calculateInterest() + "원");
		}
	}

}
