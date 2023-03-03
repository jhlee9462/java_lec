package test;

public class UserProc {

	public User getLoginUser(String id, String pw) {
		/* getLoginUser() 를 완성하세요
		 * 
		 * 매개변수로 들어온 id와 pw를 pororo와 1234와 비교하여 맞으면 entity
		 * 객체를 만들어 setter를 통해 id, pw, "뽀로로", 89.97을 대입하세요
		 * 
		 * entity를 리턴하세요
		 */
		
		if (id.equals("pororo") && pw.equals("1234")) {
			return new User(id, pw, "뽀로로", 89.97);
		}
		
		return null;
	}
	
}
