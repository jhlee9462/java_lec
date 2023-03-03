package shape;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape sh;
		
		sh = new Triangle(7, 3);
		System.out.println("삼각형의 넓이 : " + sh.getSize());
		
		sh = new Rectangle(4, 5);
		System.out.println("사각형의 넓이 : " + sh.getSize());
		
		Rectangle rt = new Rectangle(4, 5);
		System.out.println("사각형의 넓이 : " + rt.getSize());
		
		Triangle tr = new Triangle(7, 3);
		System.out.println("삼각형의 넓이 : " + tr.getSize());
	}

}
