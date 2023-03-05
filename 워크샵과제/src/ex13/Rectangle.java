package ex13;

public class Rectangle extends Shape implements Movable {

	private int width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(int width, int x, int y) {
		super(new Point(x, y));
		this.width = width;
	}

	@Override
	public void move(int x, int y) {
		super.point.setX(super.point.getX() + x + 2);
		super.point.setY(super.point.getY() + y + 2);
	}

	@Override
	public double getArea() {
		return width * width;
	}

	@Override
	public double getCircumference() {
		return width * 4;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}

}
