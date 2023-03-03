package employee;
/* 사원번호 : 101				<=== developer
 * 사원이름 : Scott
 * 내선번호 : 5678
 * 기본급여 : 2500000
 * 보너스+수당 : 450000
 * 지급금액 : 2950000원
 * 
 * 사원번호 : 201				<=== engineer
 * 사원이름 : Tiger
 * 내선번호 : 1234
 * 기본급여 : 1500000
 * 보너스+수당 : 225000
 * 지급금액 : 1725000원
 */
public class EmpMain {

	public static void main(String[] args) {
		Emp e1 = new Developer(101, "Scott", "5678");
		Emp e2 = new Engineer(201, "Tiger", "1234");
		
		e1.setSalary(2500000);
		e1.setBonus(350000);
		
		e2.setSalary(1500000);
		e2.setBonus(75000);
		
		System.out.println(e1.toString());
		System.out.println();
		System.out.println(e2.toString());
	}

}
