package example30;

class Test31 {
	private double base = 5.0, height = 3.5;

	public double getArea() {
		return base * height / 2;
	}

	public double getHypotenuse() {
		return Math.sqrt(base * base + height * height);
	}

	public double getPerimeter() {
		return base + height + getHypotenuse();
	}
}

public class Ex31 {

	public static void main(String[] args) {
		Test31 ob = new Test31();
		System.out.println("삼각형의 넓이 : " + String.format("%.2f", ob.getArea()));
		System.out.println("빗변길이 : " + String.format("%.2f", ob.getHypotenuse()));
		System.out.println("둘레길이 : " + String.format("%.2f", ob.getPerimeter()));
	}

}
