package ex11;

public class Car extends Vehicle {

	private double restOil;
	private int curWeight;
	
	public Car() {
	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public void addOil(int oil) {
		if (restOil + oil > getOilTankSize()) {
			System.out.println("오일탱크의 크기를 넘어섰습니다.");
			restOil = getOilTankSize();
			return;
		} else {
			restOil += oil;
			return;
		}
	}
	
	public void moving(int distance) {
		restOil -= distance / getEfficiency();
		if (restOil < 0) {
			System.out.println("오일이 바닥났습니다.");
			restOil = 0;
		}
	}
	
	public void addWeight(int weight) {
		if (getMaxWeight() < curWeight + weight) {
			System.out.println("최대 적재중량을 초과했습니다.");
		}
		
		curWeight += weight;
	}
	
	@Override
	public String toString() {
		return super.toString() + restOil + "\t" + curWeight + "\t\t";
	}

	public double getRestOil() {
		return restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
}
