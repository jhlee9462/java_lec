package object;

/* 클래스명 : Emp1
 * -name : String
 * -dept : String
 * -salay : int
 * +Emp1(name : String, dept : String, salay : int)
 * +printEmp() : void
 */

class Emp1 {
	private String name, dept;
	private int salay;

	public Emp1(String name, String dept, int salay) {
		this.name = name;
		this.dept = dept;
		this.salay = salay;
	}

	public void printEmp() {
		System.out.println(name + "사원은 " + dept + "에 근무하며 " + salay + "원의 급여를 받습니다");
	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
		Emp1 em = new Emp1("윈터", "개발부", 1520000);
		em.printEmp();
	}

}

/*
 * 클래스명 : Emp1 -name : String -dept : String -salay : int +setEmp(name : String,
 * dept : String, salay : int) : void +printEmp() : void
 */

//class Emp1 {
//	private String name, dept;
//	private int salay;
//	
//	public void setEmp(String name, String dept, int salay) {
//		this.name = name;
//		this.dept = dept;
//		this.salay = salay;
//	}
//	
//	public void printEmp() {
//		System.out.println(name + "사원은 " + dept + "에 근무하며 " + salay + "원의 급여를 받습니다");
//	}
//}
//
//public class ObjectTest1 {
//
//	public static void main(String[] args) {
//		Emp1 em = new Emp1();
//		em.setEmp("윈터", "개발부", 1520000);
//		em.printEmp();
//	}
//
//}
