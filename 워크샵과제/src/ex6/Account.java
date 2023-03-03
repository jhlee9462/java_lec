package ex6;

public class Account {
	
	private String account;
	private int balance;
	private double interestRest;
	
	public Account() {
	}

	public Account(String account, int balance, double interestRest) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRest = interestRest;
	}
	
	public double calculateInterest() {
		return balance * interestRest;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if (balance - money < 0) {
			System.out.println("출금 할 수 없습니다.");
			return;
		}
		
		balance -= money;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRest() {
		return interestRest;
	}

	public void setInterestRest(double interestRest) {
		this.interestRest = interestRest;
	}
	
	public void accountInfo() {
		System.out.print("계좌번호: " + account + " 잔액: " + balance + "원 이자율: " + String.format("%.1f", (interestRest * 100)) + "%");
	}
	
}
