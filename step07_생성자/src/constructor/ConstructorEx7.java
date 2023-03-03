package constructor;

public class ConstructorEx7 {

	public static void main(String[] args) {
		Member ob1 = new Member();
		ob1.view();
		// 이름 : 이순신
		// 나이 : 25
		Member ob2 = new Member("가나다", 22);
		ob2.view();
	}

}
