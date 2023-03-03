package ex11;

public class Truck extends Car {

	public Truck() {
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public double getEfficiency() {
		return super.getEfficiency() - 0.2 * (getCurWeight() / 5.0);
	}
	
	public void moving(int distance) {
		setRestOil(getRestOil() - calcOil(distance));
	}
	
	private double calcOil(int distance) {
		return distance / getEfficiency();
	}
	
	public int getCost(int distance) {
		return (int) (3000 * calcOil(distance));
	}
	
	@Override
	public String toString() {
		return super.toString() + getEfficiency();
	}
}
