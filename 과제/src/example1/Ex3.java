package example1;

public class Ex3 {

	public static void main(String[] args) {
		int base = 1500000;
		int timepay = 55000;
		double taxRate = 0.1;
		int total = base + timepay - (int) (base * taxRate);
		
		System.out.println("실수령액 : " + total + "원");
	}

}
