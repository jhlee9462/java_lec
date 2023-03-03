package example40;

public class EmpExt extends Emp {
	
	String department = "홍보부";
	
	@Override
	public String getDisplay() {
		return super.getDisplay() + "\n부서 : " +department;
	}
}
