package abstractex;

abstract class Shape {
	abstract public void onDraw();
	abstract public void onDelete();
}
// ---------------------------------------
class Rectangle extends Shape {

	@Override
	public void onDraw() {
		System.out.println("사각형을 그려요...");
	}

	@Override
	public void onDelete() {
		System.out.println("사각형을 지워요...");
	}
	
}
// ----------------------------------------
class Circle extends Shape {

	@Override
	public void onDraw() {
		System.out.println("원을 그려요...");
	}

	@Override
	public void onDelete() {
		System.out.println("원을 지워요...");
	}
	
}
// ----------------------------------------
public class AbstractEx2 {

	public static void main(String[] args) {
		Rectangle rt = new Rectangle();
		rt.onDraw();
		rt.onDelete();
		
		Circle cir = new Circle();
		cir.onDraw();
		cir.onDelete();
		
		Shape sh = new Rectangle();
		sh.onDraw();
		sh.onDelete();
		
		sh = new Circle();
		sh.onDraw();
		sh.onDelete();
	}

}
