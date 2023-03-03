package example40;

public class CircleRound extends Circle {

	public CircleRound(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
	public void compute() {
		size = r * 2 * PI;
	}

	public void output() {
		System.out.println("원의둘레 : " + size);
	}
	
}
