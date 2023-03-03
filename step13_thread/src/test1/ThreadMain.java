package test1;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		EnglishLowerThread t1 = new EnglishLowerThread();
		EnglishUpperThread t2 = new EnglishUpperThread();
		KoreanThread t3 = new KoreanThread();
		
		t3.start();
		t3.join();
		t2.start();
		t2.join();
		t1.start();
	}

}
