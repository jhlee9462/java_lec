package ex13;

public class Boat extends Ship {

	public Boat() {
		// TODO Auto-generated constructor stub
	}
	
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank() - dist * 10);
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + fuel * 10);
	}

}
