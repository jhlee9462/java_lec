package ex7;

public class Secretary extends Employee implements Bonus {

	public Secretary() {
		// TODO Auto-generated constructor stub
	}
	
	public Secretary(String name, String department, int number, int salary) {
		super(name, department, number, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void incentive(int pay) {
		setSalary((int) (getSalary() + pay * 0.8));
	}

	@Override
	public double tax() {
		return getSalary() * 0.1;
	}

}
