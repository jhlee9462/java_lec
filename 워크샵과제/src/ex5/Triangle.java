package ex5;

public class Triangle extends Shape implements Resize {

	public Triangle() {
	}
	
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight() + size);
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2.0;
	}

}
