package 자바과제9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SportsCar implements CurrentSpeed, Speed {

	public int velocity, currVelocity;
	
	public SportsCar() {
		currVelocity = SPEED;
	}
	
	public void inVelocity() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("속도입력를 입력하시오 : ");
		try {
			velocity = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void outVelocity() {
		if (velocity > 0) {
			currVelocity += speedUp(velocity);
		} else {
			currVelocity += speedDown(velocity);
		}
	}
	
	@Override
	public int speedUp(int inc) {
		return inc;
	}

	@Override
	public int speedDown(int dec) {
		return dec;
	}

	@Override
	public void currSpeedCheck() {
		if (currVelocity > 0)
			System.out.println("현재속도는 " + currVelocity + "km/h 입니다");
		else {
			System.out.println("정지하셨습니다.");
			System.exit(0);
		}
	}

}
