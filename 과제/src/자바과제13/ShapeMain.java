package 자바과제13;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.사각형 2.원 3.종료");
			System.out.print("select(1-3) : ");
			int choice = Integer.parseInt(sc.next());
			Shape sh = null;
			
			switch (choice) {
			case 1:
				sh = new Rectangle();
				break;
			case 2:
				sh = new Circle();
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
			
			sh.onDraw();
			sh.onDelete();
		}
	}

}
