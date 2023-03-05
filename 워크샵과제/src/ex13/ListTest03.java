package ex13;

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list1.add((int) (Math.random() * 10));
			list2.add((int) (Math.random() * 10));
		}

		for (int i = 0; i < 10; i++) {
			Object result = null;
			
			try {
				result = (int) (list1.get(i) / list2.get(i));
			} catch (ArithmeticException e) {
				result = "분모가0입니다";
			}
			
			System.out.println(list1.get(i) + "/" + list2.get(i) + " " + result);

		}
	}

}
