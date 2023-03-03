package example40;

public class Triangle extends Shape {
	
	public Triangle(int nData1, int nData2) {
		super(nData1, nData2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return getnData1() * getnData2() / 2.0;
	}

}
