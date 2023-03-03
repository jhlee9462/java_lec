package step02_연산자;

// casting : 자료형의 변환

public class CastingEx {

	public static void main(String[] args) {

		int pay = 857650;
		double tax = 0.033; // 3.3 %

		int rPay = pay - (int) (pay * tax);
		System.out.println("실 수령액 : " + rPay);

//		int k = 95, e = 85, m = 73;
//		
//		int tot = k + e + m;
//		double avg  = tot / 3; // 몫을 구하는 식, 84
//		double avg = tot / 3.0; // 자동 형변환
//		double avg = (double) tot / 3; // tot 를 double 로 강제 형변환 후 나누기 때문에 84.333333 이 된다.
//		
//		System.out.println("총점 : " + tot); // 253
//		System.out.println("평균 : " + avg); // 84.333333
//		System.out.println(String.format("평균 : %.2f", avg));

//		byte a = 100;
//		int b = a; // 자동 형변환
//
//		double c = 73.45;
//		int d = (int) c; // 강제 형변환
//		
//		System.out.println(a + "\t" + b);
//		System.out.println(c + "\t" + d);
	}

}
