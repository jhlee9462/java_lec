package example1;

public class Ex5 {

	public static void main(String[] args) {
		String name = "민들래";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + (kor + eng + mat));
		System.out.printf("평균점수 : %.1f\n", (kor + eng + mat) / 3.0);
	}

}
