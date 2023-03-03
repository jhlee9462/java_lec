package 자바과제10;

public class Profile {

	public String name, phone;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public void printView() {
		System.out.println("이름: " + name);
		System.out.println("연락처: " + phone);
	}
	
}
