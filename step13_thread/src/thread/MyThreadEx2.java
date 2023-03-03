package thread;

// 다중 쓰레드 (multiple thread)
public class MyThreadEx2 extends Thread {
	
	String str;
	int num;

	public MyThreadEx2() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThreadEx2(String str, int num) {
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
		
		MyThreadEx2 th1 = new MyThreadEx2("one", 100);
		MyThreadEx2 th2 = new MyThreadEx2("two", 100);
		MyThreadEx2 th3 = new MyThreadEx2("three", 100);
		
		th1.start();
		th2.start();
		th3.start();
		
		/* start() 는 쓰레드(VMThread)를 생성하고, 
		 * 만들어진 쓰레드가 run() 을 실행.
		 * run() 은 Runnable객체의 run() 을 호출
		 */
	}

}
