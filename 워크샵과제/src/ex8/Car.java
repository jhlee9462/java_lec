package ex8;

public abstract class Car {

	private String name, engine;
	private int oilTank, oilSize, distance;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	public abstract void go(int distance);
	
	public abstract void setOil(int oilSize);

	public String getName() {
		return name;
	}

	public String getEngine() {
		return engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
