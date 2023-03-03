package db3;

public class UserEntity {

	private int num;
	private String id, passwd, name;
	private double score;
	
	public UserEntity() {
	}

	public UserEntity(String id, String passwd, String name, double score) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.score = score;
	}

	public UserEntity(int num, String id, String passwd, String name, double score) {
		this.num = num;
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.score = score;
	}

	public int getNum() {
		return num;
	}

	public String getId() {
		return id;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
}
