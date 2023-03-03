package ex7;

public abstract class Employee {

	private String name, department;
	private int number, salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String department, int number, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.number = number;
		this.salary = salary;
	}
	
	public abstract double tax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
