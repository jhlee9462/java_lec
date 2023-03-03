package ex8;

public class L5 extends Car implements Temp {

	public L5() {
		// TODO Auto-generated constructor stub
	}
	
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTempGage() {
		return getDistance() / 5;
	}

	@Override
	public void go(int distance) {
		setDistance(getDistance() + distance);
		setOilSize(getOilSize() - distance / 8);
	}

	@Override
	public void setOil(int oilSize) {
		if (getOilSize() + oilSize > getOilTank())
			setOilSize(getOilTank());
		else 
			setOilSize(getOilSize() + oilSize);
	}

}
