package example40;

class Salary {
	private String name;
	private int salary;
	
	public Salary() {
	}
	
	public Salary(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void viewInformation() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
	}
}

class Test41 extends Salary {
	private String department;
	
	public Test41() {
	}

	public Test41(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	@Override
	public void viewInformation() {
		super.viewInformation();
		System.out.println("부서 : " + department);
	}
}

public class Ex41 {

	public static void main(String[] args) {
		Test41 ob = new Test41("홍길동", 85000000, "개발부");
		ob.viewInformation();
	}

}
