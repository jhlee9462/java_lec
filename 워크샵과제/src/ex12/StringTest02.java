package ex12;

import java.util.Random;

public class StringTest02 {

	public static void main(String[] args) {

		ConvertString cs = new ConvertString();
		int number = new Random().nextInt(1000000, 5000001);
		
		System.out.println(cs.convert(number));
		
	}

}
