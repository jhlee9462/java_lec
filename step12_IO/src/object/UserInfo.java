package object;

import java.io.Serializable;

public class UserInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double score;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void disp() {
		System.out.print("이름 : " + name);
		System.out.print("\t나이 : " + age);
		System.out.println("\t점수 : " + score);
	}
	
}
