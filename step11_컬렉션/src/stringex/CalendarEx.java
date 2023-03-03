package stringex;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
//		System.out.println("오늘 날짜 : " + new Date());
//		Calendar cal = new Calendar(); // 생성자 호출 불가능
//		Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance(); // 시스템 설정 시각
		
		System.out.println("오늘 날짜 : "
				+ cal.get(Calendar.YEAR) + "년 "
				+ (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DAY_OF_MONTH) + "일");
		
		System.out.println("현재 시각 : "
				+ cal.get(Calendar.HOUR_OF_DAY) + "시 "
				+ cal.get(Calendar.MINUTE) + "분 "
				+ cal.get(Calendar.SECOND) + "초");
	}

}
