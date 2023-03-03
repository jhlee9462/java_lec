package test2;

public class Producer implements Runnable {

	private VendingMachine vm;
	
	public Producer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			vm.putDrink(String.valueOf(i));
		}
	}

}
