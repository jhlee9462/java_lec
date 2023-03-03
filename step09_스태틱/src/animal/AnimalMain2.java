package animal;

import java.util.Scanner;
// 동적 바인딩
public class AnimalMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		Animal ani = null;

		while (true) {
			System.out.print("1. Dog | 2. Cat | 3. Duck | 4. Fish | 5. Exit\n선택하세요 : ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				ani = new Dog();
				break;
			case 2:
				ani = new Cat();
				break;
			case 3:
				ani = new Duck();
				break;
			case 4:
				ani = new Fish();
				break;
			case 5:
				System.out.println("***** 종료합니다. *****");
				sc.close();
				System.exit(0);
			default:
				System.out.println("입력값이 잘못되었습니다.\n다시 입력하세요");
			}
			
			ani.speak();
			ani.walk();
		}

	}
}