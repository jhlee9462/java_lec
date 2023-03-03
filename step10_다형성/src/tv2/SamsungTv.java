package tv2;

public class SamsungTv implements Tv {
	
	public void turnOn() {
		System.out.println("Samsung TV - 전원을 켠다");
	}
	
	public void turnOff() {
		System.out.println("Samsung TV - 전원을 끈다");
	}
	
	public void volumeUp() {
		System.out.println("Samsung TV - 소리를 높인다");
	}
	
	public void volumeDown() {
		System.out.println("Samsung TV - 소리를 줄인다");
	}
	
}
