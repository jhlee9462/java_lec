package ex12;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		ConvertDate cd = new ConvertDate();
		Date date = new Date();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(cd.convert(date, i));
		}
	}

}
