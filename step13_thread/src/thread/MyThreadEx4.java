package thread;

// 데몬 쓰레드 (daemon thread)
/* 일반 쓰레드가 종료되면 데몬 쓰레드를 강제로 종료
 * 일반 쓰레드가 종료되면 데몬 쓰레드의 존재의미가 없음.
 * ex) hwp의 자동저장, 화면 자동갱신
 */
class DaemonTest extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(300);
				System.out.println("hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThreadEx4 {

	public static void main(String[] args) {

		DaemonTest th = new DaemonTest();
		th.setDaemon(true); // true 로 지정하면 현재 스레드의 daemon 스레드가 됨
		th.start();
		
		int n = 0;
		while (n < 10) {
			n++;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
