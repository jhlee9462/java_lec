package example30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Shape {
	public double area;
	final public double PI = 3.141592;
	
	public Shape() {
	}
	
	public int menu() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("**** 도형선택 ****");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
				
		return Integer.parseInt(br.readLine());
	}
	
	public void circle() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int radius = 0;
		System.out.println("**** 원의 넓이 ****");
		System.out.print("반지름 : ");
		radius = Integer.parseInt(br.readLine());
		
		System.out.printf("넓이 : %.2f\n", radius * radius * PI);
		
	}
	
	public void triangle() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int width, height;
		
		System.out.println("**** 삼각형의 넓이 ****");
		System.out.print("밑변 : ");
		width = Integer.parseInt(br.readLine());
		System.out.print("높이 : ");
		height = Integer.parseInt(br.readLine());
		
		System.out.printf("넓이 : %.2f\n", width * height / 2.0);
		
	}
	
	public void trapezoid() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bottom, top, height;
		
		System.out.println("**** 사다리꼴의 넓이 ****");
		System.out.print("아랫변 : ");
		bottom = Integer.parseInt(br.readLine());
		System.out.print("윗 변 : ");
		top = Integer.parseInt(br.readLine());
		System.out.print("높 이 : ");
		height = Integer.parseInt(br.readLine());
		
		System.out.printf("넓이 : %.2f\n", (bottom + top) * height / 2.0);
		
	}
}

public class Ex37 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Shape ob = new Shape();
		int n = 0;
		while (true) {
			n = ob.menu();
			switch (n) {
			case 1:
				ob.triangle();
				break;
			case 2:
				ob.circle();
				break;
			case 3:
				ob.trapezoid();
				break;
			case 4:
				System.exit(0);
			}
		}
	}

}
