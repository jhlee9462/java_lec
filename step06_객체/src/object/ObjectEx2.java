package object;

public class ObjectEx2 {

	public static void main(String[] args) {
		// 객체를 만들 대상의 클래스는 
		// 사용하고자 하는 함수가 있는 클래스로 객체를 생성
		
		// 이름은 뽀로로이고 총점은 253점입니다.
		
		User ob = new User();
		ob.setUser("뽀로로", 95, 85, 73);
		System.out.println(ob.getUser());
	}

}
