package ex13;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		if (num < 5 || num > 10) {
			System.out.println("5부터 10 사이의 숫자를 입력해주세요");
			System.exit(1);
		}
		
		MakeList ml = new MakeList();
		ml.makeArray(num);
		
		ArrayList<Integer> list = null;
		list = ml.getList();
		for (int i : list)
			System.out.print(i + " ");
		System.out.println("\n평균 : " + ml.getAverage());
	}

}
