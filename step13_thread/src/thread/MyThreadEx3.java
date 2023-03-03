package thread;

// 다중 쓰레드 (multiple thread)
public class MyThreadEx3 implements Runnable {
	
	String str;
	int num;

	public MyThreadEx3() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThreadEx3(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.println(str + " " + (i + 1));
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyThreadEx3 th1 = new MyThreadEx3("one", 100);
		MyThreadEx3 th2 = new MyThreadEx3("two", 100);
		MyThreadEx3 th3 = new MyThreadEx3("three", 100);
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);
		
		t1.start();
		t2.start();
		t3.start();
		
		/* start() 는 쓰레드(VMThread)를 생성하고, 
		 * 만들어진 쓰레드가 run() 을 실행.
		 * run() 은 Runnable객체의 run() 을 호출
		 */
	}

}
