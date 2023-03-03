package thread;
/* 쓰레드의 우선순위
 * setPriority() 이용하여 우선순위 부여 (1 ~ 10)
 * 우선 순위가 높은 쓰레드는 우선 순위가 낮은 쓰레드에 비해 실행 시간을 많이 할당 받음
 * 다른 쓰레드에 비하여 많은 실행 시간을 필요로 한다면 우선 순위를 높게 두면 됨
 * MAX_PRIORITY : 우선순위 10(최고순위)
 * MIN_PRIORITY : 우선순위 1(최저순위)
 * NORM_PRIORITY : 우선순위 5(순위 미지정)
 */

public class RoseTest extends Thread {

	private String str;

	public RoseTest(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			try {
				Thread.sleep(5);
				System.out.println(str + "\t" + Thread.currentThread());
				// 이름, 우선 순위, 그룹
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		RoseTest rt1= new RoseTest("사랑");
		RoseTest rt2= new RoseTest("가시");
		RoseTest rt3= new RoseTest("장미");
		
//		rt1.setPriority(MAX_PRIORITY);
//		rt2.setPriority(MIN_PRIORITY);
//		rt3.setPriority(NORM_PRIORITY);
//		
//		rt1.start();
//		rt2.start();
//		rt3.start();
		
		try {
			rt1.start();
			rt1.join(); // rt1 이 종료될때까지 rt2, rt3 는 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rt2.start();
		rt3.start();
		
		
	}

}
