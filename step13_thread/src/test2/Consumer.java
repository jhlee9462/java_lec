package test2;

public class Consumer implements Runnable {

	private VendingMachine vm;
	
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			vm.getDrink();
		}
	}

}
