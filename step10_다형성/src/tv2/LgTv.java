package tv2;

public class LgTv implements Tv {

	public void turnOn() {
		System.out.println("LG TV - 전원을 켠다");
	}
	
	public void turnOff() {
		System.out.println("LG TV - 전원을 끈다");
	}
	
	public void volumeUp() {
		System.out.println("LG TV - 소리를 높인다");
	}
	
	public void volumeDown() {
		System.out.println("LG TV - 소리를 줄인다");
	}
	
}
