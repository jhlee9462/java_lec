package example40;

public class CircleArea extends Circle {

	public CircleArea(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	public void compute() {
		size = r * r * PI;
	}
	
	public void output() {
		System.out.println("원의넓이 : " + size);
	}
	
}
