package object;
// setter & getter : 멤버변수 하나당 하나씩 값을 대입하는 setter
// 					 그 값을 리턴하는 getter

class Member {
	private String name;
	private int age;
	private double tall;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setTall(double tall) {
		this.tall = tall;
	}
	
	public double getTall() {
		return tall;
	}
}

public class ObjectEx3 {

	public static void main(String[] args) {
		Member ob = new Member();
		ob.setName("이순신");
		ob.setAge(23);
		ob.setTall(175.3);
		
		System.out.println("이름 : " + ob.getName());
		System.out.println("나이 : " + ob.getAge());
		System.out.println("신장 : " + ob.getTall());
	}

}
