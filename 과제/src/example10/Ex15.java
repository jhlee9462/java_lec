package example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ex15 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int usrInput;
		char usrSelect = '\0';
		boolean run = true;

		Outer : while (run) {
			int tries = 0;
			Random random = new Random();
			int num = random.nextInt(100);
			System.out.println("*** 난수가 발생하였습니다. 맞추어 보세요. ***");
			while (run) {
				++tries;

				System.out.println("숫자 입력 : ");
				usrInput = Integer.parseInt(br.readLine());

				if (usrInput < num) {
					System.out.println("컴퓨터의 숫자가 더 큽니다.");
				} else if (usrInput > num) {
					System.out.println("컴퓨터의 숫자가 더 작습니다.");
				} else {
					System.out.println("추카추카..." + tries + "번만에 맞추셨습니다.");
					System.out.println("다시 할까요(Y/y): ");
					usrSelect = br.readLine().charAt(0);
					switch (usrSelect) {
					case 'N':
					case 'n':
						run = false;
						break Outer;
					case 'Y':
					case 'y':
						continue Outer;
					}
				}
			}
		}

		System.out.println("** 수고 하셨습니다 **");
	}

}
