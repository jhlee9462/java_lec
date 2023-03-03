package example40;

public abstract class Shape {
	
	private int nData1, nData2;

	public Shape(int nData1, int nData2) {
		super();
		this.nData1 = nData1;
		this.nData2 = nData2;
	}

	public int getnData1() {
		return nData1;
	}

	public int getnData2() {
		return nData2;
	}
	
	public abstract double getArea(); 
	
}
