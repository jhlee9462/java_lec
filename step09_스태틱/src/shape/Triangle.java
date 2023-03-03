package shape;

public class Triangle extends Shape {

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSize() {
		return getX() * getY() / 2.0;
	}
}
