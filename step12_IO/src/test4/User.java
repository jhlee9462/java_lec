package test4;

import java.io.Serializable;

public class User implements Serializable {

	private String name;
	private int age;
	private double tall;
	
	public User(String name, int age, double tall) {
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\t나이 : " + age + "\t키 : " + tall;
	}
}
