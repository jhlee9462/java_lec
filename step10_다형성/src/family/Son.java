package family;

public class Son extends Family implements Job {

	public Son() {
		// TODO Auto-generated constructor stub
	}

	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String work() {
		return "아들은 공부를 한다";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
