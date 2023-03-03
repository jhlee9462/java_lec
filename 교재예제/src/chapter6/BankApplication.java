package chapter6;

import java.util.Scanner;

public class BankApplication {

	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int currentAccountNum = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1)
				createAccount();
			else if (selectNo == 2)
				accountList();
			else if (selectNo == 3)
				deposit();
			else if (selectNo == 4)
				withdraw();
			else if (selectNo == 5)
				run = false;
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		
		String ano, aowner;
		
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		ano = scanner.next();
		
		System.out.println("계좌주: ");
		aowner = scanner.next();
		System.out.println("초기입금액: ");
		int firstBalance = scanner.nextInt();
		
		Account2 temp = new Account2(ano, aowner, firstBalance);
		accountArray[currentAccountNum] = temp;
		++currentAccountNum;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for (int i = 0; i < currentAccountNum; i++) {
			System.out.println(accountArray[i].getAno() + "    " + accountArray[i].getOwner() + "    " + accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		Account2 temp = findAccount2(ano);
		System.out.println("예금액: ");
		int depos = scanner.nextInt();
		temp.setBalance(temp.getBalance() + depos);
		System.out.println("결과: 예금이 성공했습니다.");
	}

	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		Account2 temp = findAccount2(ano);
		System.out.println("출금액: ");
		int withd = scanner.nextInt();
		temp.setBalance(temp.getBalance() - withd);
		System.out.println("결과: 출금이 성공했습니다.");
	}
	
	private static Account2 findAccount2(String ano) {
		for (int i = 0; i < currentAccountNum; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		System.out.println("해당 계좌번호는 존재하지 않습니다.");
		return null;
	}
}
