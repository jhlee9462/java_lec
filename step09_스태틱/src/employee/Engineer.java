package employee;
/* Emp 를 상속받은 후
 * -salary : long
 * -bonus : long
 * +Engineer()
 * +Engineer(eno : int, ename : String, phone : String)
 * +toString() : String
 * 
 * --조건 : 보너스에 150000 을 수당으로 더해서 지급
 */
public class Engineer extends Emp {
	private long salary, bonus;
	
	public Engineer() {
		// TODO Auto-generated constructor stub
	}

	public Engineer(int eno, String ename, String phone) {
		super(eno, ename, phone);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "사원번호 : " + getEno() + "\n사원이름 : " + getEname() + "\n내선번호 : " 
						+ getPhone() + "\n기본급여 : " + salary + "\n보너스+수당 : " + bonus
						+ "\n지급금액 : " + (salary + bonus) + "원";
	}
	
	@Override
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	@Override
	public void setBonus(long bonus) {
		this.bonus = bonus + 150000;
	}
}
