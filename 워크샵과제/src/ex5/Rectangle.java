package ex5;

public class Rectangle extends Shape implements Resize {
	
	public Rectangle() {
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		setWidth(getWidth() + size);
	}

	@Override
	public double getArea() {
		// 어짜피 int 형이므로 double 형으로 casting 은 하지 않았다.
		return getWidth() * getHeight(); 
	}

}
