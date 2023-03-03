package objectarray;

public class UserEx2 {

	public static void main(String[] args) {
		User[] ob = new User[3];
		ob[0] = new User("둘리", "강남구");
		ob[1] = new User("도우너", "강동구");
		ob[2] = new User("마이콜", "강서구");

		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i].getName() + "\t" + ob[i].getAddr());
		}
		
	}

}
