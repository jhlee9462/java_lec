package constructor;
// 홍길동의 점수는 253점이며 평균은 84.33점이고 학점은 B입니다
// 이름 : 민들래			<=== 매개변수 4개인 생성자를 사용하여 객체 생성하고 대입한 후 getter를 이용하여 출력
// 국어 : 95
// 영어 : 85
// 수학 : 73
// 총점 : 253
// 평균 : 84.33
// 학점 : B
public class ConstructorEx6 {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("홍길동");
		st.setKor(95);
		st.setEng(85);
		st.setMat(73);
		
		System.out.println(st.toString());
		
		Student st2 = new Student("진달래", 95, 85, 73);
		
		System.out.println("이름 : " + st2.getName());
		System.out.println("국어 : " + st2.getKor());
		System.out.println("영어 : " + st2.getEng());
		System.out.println("수학 : " + st2.getMat());
		System.out.println("총점 : " + st2.getTotal());
		System.out.printf("평균 : %.2f\n", st2.getAvg());
		System.out.println("학점 : " + st2.getGrade());
	}

}
