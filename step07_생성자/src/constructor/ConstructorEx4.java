package constructor;

import java.util.Scanner;

/* 클래스명 : ConstructorEx4
 * x :int
 * y :int
 * +ConstructorEx4()		<== 입력받기
 * +calc() : int			<== x * y 를 리턴
 * +display() : void		<== 출력하기
 * 
 */

public class ConstructorEx4 {

	int x, y;
	
	public ConstructorEx4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력 : ");
		x = sc.nextInt();
		System.out.print("세로를 입력 : ");
		y = sc.nextInt();
		sc.close();
	}
	
	public int calc() {
		return x * y;
	}
	
	public void display() {
		System.out.println("사각형의 넓이 : " + calc());
	}
	
	public static void main(String[] args) {
		new ConstructorEx4().display();
	}

}
