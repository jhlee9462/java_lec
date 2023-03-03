package constructor;
/* 클래스명 : UserInfo
 * -name : String
 * -addr : String
 * +UserInfo()
 * +UserInfo(name : String, addr : String)
 * +getter
 * ---------------------------------------
 * -- 출력결과 --
 * *** 주소록 ***			<=== 디폴트 생성자에서 출력
 * 이름 : 블랙핑크			<=== main 메서드에서 getter를 이용하여 출력
 * 주소 : 강남구 역삼동		<=== main 메서드에서 getter를 이용하여 출력
 */

class UserInfo {
	private String name;
	private String addr;
	
	public UserInfo() {
		System.out.println("*** 주소록 ***");
	}
	
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}
	
	
}
public class ConstructorEx3 {

	public static void main(String[] args) {
		UserInfo bp = new UserInfo("블랙핑크", "강남구 역삼동");
		System.out.println("이름 : " + bp.getName());
		System.out.println("주소 : " + bp.getAddr());
	}

}
