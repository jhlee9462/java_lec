package animal;

import java.util.Scanner;
// 실제로는 동적 바인딩이지만 형태는 정적 바인딩의 형식이다
public class AnimalMain1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		Dog dg = null;
		Cat ct = null;
		Duck dk = null;
		Fish fs = null;
		
		while (true) {
			System.out.print("1. Dog | 2. Cat | 3. Duck | 4. Fish | 5. Exit\n선택하세요 : ");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				dg = new Dog();
				dg.speak();
				dg.walk();
				break;
			case 2:
				ct = new Cat();
				ct.speak();
				ct.walk();
				break;
			case 3:
				dk = new Duck();
				dk.speak();
				dk.walk();
				break;
			case 4:
				fs = new Fish();
				fs.speak();
				fs.walk();
				break;
			case 5:
				System.out.println("***** 종료합니다. *****");
				sc.close();
				System.exit(0);
			default:
				System.out.println("입력값이 잘못되었습니다.\n다시 입력하세요");
			}
			
		}
	}

}
