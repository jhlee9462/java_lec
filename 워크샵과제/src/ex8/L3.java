package ex8;

public class L3 extends Car implements Temp {

	public L3() {
		// TODO Auto-generated constructor stub
	}
	
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTempGage() {
		return getDistance() / 10;
	}

	@Override
	public void go(int distance) {
		setDistance(getDistance() + distance);
		setOilSize(getOilSize() - distance / 10);
	}

	@Override
	public void setOil(int oilSize) {
		if (getOilSize() + oilSize > getOilTank())
			setOilSize(getOilTank());
		else 
			setOilSize(getOilSize() + oilSize);
	}

}
