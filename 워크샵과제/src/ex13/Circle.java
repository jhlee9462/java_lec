package ex13;

public class Circle extends Shape implements Movable {

	private int radius;
	
	public Circle() {
	}

	public Circle(int radius, int x, int y) {
		super(new Point(x, y));
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getCircumference() {
		return Math.PI * radius * 2;
	}
	
	public void move(int x, int y) {
		super.point.setX(super.point.getX() + x + 1);
		super.point.setY(super.point.getY() + y + 1);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
