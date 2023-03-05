package ex10;

public class MonthsTest {

	public static void main(String[] args) {

		int months = 0;
		
		try {
			months = Integer.parseInt(args[0]);
			if (months < 1 || months > 12)
				throw new NumberFormatException();
		} catch (NumberFormatException e) {
			System.out.println("입력된 값이 잘못 되었습니다.");
			System.exit(1);
		}
		
		Months mon = new Months();
		System.out.println("입력받은월:" + months + "월");
		System.out.println("마지막일자:" + mon.getDays(months) + "일");
	}

}
