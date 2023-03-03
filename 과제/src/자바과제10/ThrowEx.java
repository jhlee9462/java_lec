package 자바과제10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowEx {

	public int dan;
	
	public void inputData() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 입력 : ");
		
		try {
			dan = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("정수값만 입력해 주시오");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		guguPrint();
	}
	
	public void guguPrint() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
}
