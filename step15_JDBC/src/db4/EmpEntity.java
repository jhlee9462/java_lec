package db4;

public class EmpEntity {

	private int num;
	private String name, phone, addr;
	
	public EmpEntity() {
	}

	public EmpEntity(int num, String name, String phone, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
