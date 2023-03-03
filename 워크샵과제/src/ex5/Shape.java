package ex5;

abstract public class Shape {
	private int width, height;
	private String colors;
	
	public Shape() {
	}

	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	public abstract double getArea();

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getColors() {
		return colors;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}
	
}
