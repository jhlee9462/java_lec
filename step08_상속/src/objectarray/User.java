package objectarray;
/* 디플트 생성자, 인자 2개 생성자, getter & setter
 */
public class User {
	private String name, addr;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
