package emp;

// 디폴트생성자, 매개변수3개생성자, getter, setter
// VO(value object), entity, DTO, bean
// 데이터를 하나로 묶어서 전송할 목적으로 만든 클래스
public class EmpVO {
	
	private String name, dept;
	private int salary;
	
	public EmpVO() {
		// TODO Auto-generated constructor stub
	}

	public EmpVO(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
