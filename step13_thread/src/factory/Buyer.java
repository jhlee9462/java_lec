package factory;

public class Buyer extends Thread {

	private Factory factory;

	public Buyer(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			factory.sell();
		}
	}
}
