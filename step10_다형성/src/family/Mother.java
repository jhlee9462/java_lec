package family;

public class Mother extends Family implements Job {
	
	 public Mother() {
		// TODO Auto-generated constructor stub
	}

	public Mother(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String work() {
		return "엄마는 집안일을 한다";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	 
}
