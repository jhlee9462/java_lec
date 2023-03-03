package ex12;

public class Account {

	private String account;
	private double balance, interestRate;
	
	public Account() {
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance * interestRate;
	}
	
	public void deposit(double money) throws Exception {
		if (money < 0) {
			throw new Exception();
		}
		
		balance += money;
	}
	
	public void withdraw(double money) throws Exception {
		if (money < 0 || money > balance) {
			throw new Exception();
		}
		
		balance -= money;
	}

	public String getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
