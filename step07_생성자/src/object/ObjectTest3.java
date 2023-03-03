package object;

/* 클래스명 : Emp3
 * -name : String
 * -dept : String
 * -salay : int
 * +getter & setter
 * +toString() : String
 */
// 윈터사원은 개발부에 근무하며 15200000원의 급여를 받습니다
// 이름 : 윈터
// 부서 : 개발부
// 급여 : 1520000원
class Emp3 {
	private String name, dept;
	private int salay;
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getSalay() {
		return salay;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	@Override
	public String toString() {
		return name + "사원은 " + dept + "에 근무하며 " + salay + "원의 급여를 받습니다";
	}
	
}

public class ObjectTest3 {

	public static void main(String[] args) {
		Emp3 em = new Emp3();
		em.setName("윈터");
		em.setDept("개발부");
		em.setSalay(1520000);
		System.out.println(em.toString());
		System.out.println("이름 : " + em.getName());
		System.out.println("부서 : " + em.getDept());
		System.out.println("급여 : " + em.getSalay() + "원");
	}

}
