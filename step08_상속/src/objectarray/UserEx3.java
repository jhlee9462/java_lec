package objectarray;

public class UserEx3 {

	public static void main(String[] args) {
		User[] ob = new User[] { new User("둘리", "강남구"), new User("도우너", "강동구"), new User("마이콜", "강서구") };
	
		for (User data : ob) {
			System.out.println(data.getName() + "\t" + data.getAddr());
		}

	}

}
