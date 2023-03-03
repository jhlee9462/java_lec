package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable {

	private long depositMoney = 100000; // 은행 잔고
	private long balance;				// 찾는 금액
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName() + " 고객님 어서오세요 ");
		
		System.out.print("출금하실 금액을 입력하세요 : ");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		withDraw(); // 잔액계산
	}

	public void withDraw() {
		if (depositMoney >= balance) {
			if (balance % 10000 == 0) {
				depositMoney -= balance;
				System.out.println("남은 금액 " + depositMoney + "원 입니다\n");
			} else {
				System.out.println("만원 단위로 입력하세요\n");
			}
			
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

}
