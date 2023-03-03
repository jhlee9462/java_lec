package objectarray;

public class UserEX1 {

	public static void main(String[] args) {
		User ob1 = new User("둘리", "강남구");
		User ob2 = new User("도우너", "강동구");
		User ob3 = new User("마이콜", "강서구");
		
		System.out.println(ob1.getName() + "\t" + ob1.getAddr());
		System.out.println(ob2.getName() + "\t" + ob2.getAddr());
		System.out.println(ob3.getName() + "\t" + ob3.getAddr());
	}

}
