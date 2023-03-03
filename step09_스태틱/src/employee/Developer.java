package employee;
/* Emp 를 상속받은 후
 * -salary : long
 * -bonus : long
 * +Engineer()
 * +Engineer(eno : int, ename : String, phone : String)
 * +toString() : String
 * 
 * --조건 : 보너스에 100000 을 수당으로 더해서 지급
 */
public class Developer extends Emp {
	private long salary, bonus;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public Developer(int eno, String ename, String phone) {
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
		this.bonus = bonus + 100000;
	}
}
