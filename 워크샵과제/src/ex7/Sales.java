package ex7;

public class Sales extends Employee implements Bonus {

	public Sales() {
		// TODO Auto-generated constructor stub
	}
	
	public Sales(String name, String department, int number, int salary) {
		super(name, department, number, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void incentive(int pay) {
		setSalary((int) (getSalary() + pay * 1.2));
	}

	@Override
	public double tax() {
		return getSalary() * 0.13;
	}

}
