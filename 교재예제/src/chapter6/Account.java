package chapter6;

public class Account {
	private int balance;
	
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		
		if (balance < MIN_BALANCE || balance > MAX_BALANCE)
			return;
		
		this.balance = balance;
	}
	
	public int getBalance() {
		
		return this.balance;
		
	}
}
