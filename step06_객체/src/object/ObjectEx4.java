package object;
/* 이름은 이순신이고 개발부에 근무하며 급여는 1500000 원 입사성적은 87.5점입니다.
 * 
 * 사원이름 : 진달래
 * 근무부서 : 개발부
 * 받는급여 : 1500000
 * 입사점수 : 87.54점
 */
public class ObjectEx4 {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.setName("이순신");
		em.setDept("개발부");
		em.setPay(1500000);
		em.setScore(87.5);
		
		System.out.println(em.toString());
		
		Employee em2 = new Employee();
		em2.setEmployee("진달래", "개발부", 1500000, 87.54);
		System.out.println("사원이름 : " + em2.getName());
		System.out.println("근무부서 : " + em2.getDept());
		System.out.println("받는급여 : " + em2.getPay());
		System.out.println("입사점수 : " + em2.getScore());
		
	}

}
