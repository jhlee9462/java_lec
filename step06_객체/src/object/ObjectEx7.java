package object;

import java.util.Scanner;

public class ObjectEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, top, height;
		char usrInput = '\0';
		
		do {
			// base, top, height 을 입력 받기 (Scanner 사용)
			System.out.println("***** 사다리꼴의 넓이 구하기 *****");
			
			System.out.print("밑변을 입력하세요 : ");
			base = sc.nextInt();
			
			System.out.print("윗변을 입력하세요 : ");
			top = sc.nextInt();
			
			System.out.print("높이를 입력하세요 : ");
			height = sc.nextInt();
			
			// Trapezoid 클래스로 객체를 만들어서 넓이 구하기
			// 객체생성 --> 값 대입 --> 결과출력
			// 넓이 : 
			
			Trapezoid tz = new Trapezoid();
			tz.setTrapezoid(base, top, height);
			System.out.println(tz.toString());
			
			// 한번더 실행할까요?(y/Y)
			System.out.print("한번 더 실행할까요?(y/Y) : ");
			usrInput = sc.next().charAt(0);
			
		} while (usrInput == 'y' || usrInput == 'Y');
		
		System.out.println("수고하셨습니다");
		
		sc.close();
	}

}
