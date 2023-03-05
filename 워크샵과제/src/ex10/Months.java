package ex10;

public class Months {
	private int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getDays(int months) {
		return monthDay[months - 1];
	}
	
}
