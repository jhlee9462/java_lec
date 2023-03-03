package ex7;

public class Airplane extends Plane {

	public Airplane() {
		// TODO Auto-generated constructor stub
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize() - 30 * distance / 10);
	}

}
