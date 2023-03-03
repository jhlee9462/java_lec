package example40;

import java.util.Scanner;

public class Test46 {

	public static void main(String[] args) {
		
		Shape ob = null;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("1. 삼각형 2. 사각형 3. 종 료\n선택(1-3) : ");
			int n = sc.nextInt();
			int x = 0, y = 0;
			switch (n) {
			case 1:
				System.out.print("밑변 : ");
				x = sc.nextInt();
				System.out.print("높이 : ");
				y = sc.nextInt();
				ob = new Triangle(x, y);
				break;
			case 2:
				System.out.print("가로 : ");
				x = sc.nextInt();
				System.out.print("세로 : ");
				y = sc.nextInt();
				ob = new Rectangle(x, y);
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
			
			System.out.println("넓이 : " + ob.getArea());
		}
	}

}
