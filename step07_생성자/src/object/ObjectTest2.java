package object;
/* 클래스명 : Emp2
 * -name : String
 * -dept : String
 * -salay : int
 * +Emp2(name : String, dept : String, salay : int)
 * +toString() : String
 */
// 윈터사원은 개발부에 근무하며 1520000원의 급여를 받습니다
class Emp2 {
	private String name, dept;
	private int salay;
	
	public Emp2(String name, String dept, int salay) {
		this.name = name;
		this.dept = dept;
		this.salay = salay;
	}
	
	public String printEmp() {
		return name + "사원은 " + dept + "에 근무하며 " + salay + "원의 급여를 받습니다";
	}
}

public class ObjectTest2 {

	public static void main(String[] args) {
		Emp2 em = new Emp2("윈터", "개발부", 15200000);
		System.out.println(em.printEmp());
	}

}

///* 클래스명 : Emp2
// * -name : String
// * -dept : String
// * -salay : int
// * +setEmp(name : String, dept : String, salay : int) : void
// * +printEmp() : String
// */
//// 윈터사원은 개발부에 근무하며 1520000원의 급여를 받습니다
//class Emp2 {
//	private String name, dept;
//	private int salay;
//	
//	public void setEmp(String name, String dept, int salay) {
//		this.name = name;
//		this.dept = dept;
//		this.salay = salay;
//	}
//	
//	public String printEmp() {
//		return name + "사원은 " + dept + "에 근무하며 " + salay + "원의 급여를 받습니다";
//	}
//}
//
//public class ObjectTest2 {
//
//	public static void main(String[] args) {
//		Emp2 em = new Emp2();
//		em.setEmp("윈터", "개발부", 15200000);
//		System.out.println(em.printEmp());
//	}
//
//}
