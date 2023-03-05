package 자바과제11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test51 {

	public static void main(String[] args) {
		Calendar cd = new GregorianCalendar();
		int year = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH);
		int date = cd.get(Calendar.DATE);
		
		System.out.print(year + "년 " + month + "월 " + date + "일 ");
		System.out.println("당신의 금전운은 " + (int) (Math.random() * 101) + "%입니다.");
	}

}
