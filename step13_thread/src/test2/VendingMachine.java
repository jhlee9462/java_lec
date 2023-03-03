package test2;

import java.util.Stack;

public class VendingMachine {
	
	private Stack<String> store = new Stack<>();
	
	public synchronized String getDrink() {
		while (store.empty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		}
		
		String drink = store.pop();
		System.out.println(Thread.currentThread().getName() + " : 음료수 No. " + drink + " 꺼내먹음\n");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
		return drink;
	}
	
	public synchronized void putDrink(String drink) {
		while (!store.empty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		store.push(drink);
		System.out.println(Thread.currentThread().getName() + " : 음료수 No. " + drink + " 자판기에 넣기");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
	}

}
