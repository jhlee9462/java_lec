package methodex;
/* 입사총점 : 815점
 * 입사결과 : 합격		==> 총점이 800 이상이면 합격, 미만이면 불합격
 */
public class MethodEx6 {

	public static int total(int toeic, int it) {
		return toeic + it;
	}
	
	public static String rs(int total) {
		return total >= 810 ? "합격" : "불합격";
	}
	
	public static void main(String[] args) {
		int toeic = 750, it = 65;
		
		System.out.println("입사총점 : " + total(toeic, it) + "점");
		System.out.println("입사결과 : " + rs(total(toeic, it)));
	}

}
