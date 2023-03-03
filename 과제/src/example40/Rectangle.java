package example40;

public class Rectangle extends Shape {

	public Rectangle(int nData1, int nData2) {
		super(nData1, nData2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return getnData1() * getnData2();
	}

}
