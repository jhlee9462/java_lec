package ex8;

public class Test01 {

	public static void main(String[] args) {

		double A = 0, B = 0, C = 0, D = 0, E = 0;
		
		try {
			A = Double.parseDouble(args[0]);
			B = Double.parseDouble(args[1]);
			C = Double.parseDouble(args[2]);
			D = Double.parseDouble(args[3]);
			E = Double.parseDouble(args[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("다시 입력 하세요");
			System.exit(1);
		}
		
		if (args.length > 5) {
			System.out.println("다시 입력 하세요");
			System.exit(1);
		}
		
		if ((A < 10 || A > 99) && (B < 10 || B > 99) && (C < 10 || C > 99) && (D < 10 || D > 99) && (E < 10 || E > 99)) {
			System.out.println("다시 입력 하세요");
			System.exit(1);
		}
		
		double score = (A + B) / 2 * 0.6 + (C + D) / 2 * 0.2 + E * 0.2;
		String cla;
		System.out.println("평가점수: " + score + "점");
		
		if (score >= 90) {
			cla = "Gold Class";
		} else if (score >= 80) {
			cla = "Silver Class";
		} else if (score >= 70) {
			cla = "Bronze Class";
		} else {
			cla = "Normal Class";
		}
		
		System.out.println("Class: " + cla);
		
	}

}
