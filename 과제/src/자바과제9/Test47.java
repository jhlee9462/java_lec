package 자바과제9;

public class Test47 {

	public static void main(String[] args) {
		
		SportsCar ob = new SportsCar();
		System.out.println("**출발 속도는 10km/h입니다 **");
		while (true) {
			ob.inVelocity();
			ob.outVelocity();
			ob.currSpeedCheck();
		}
	}

}
