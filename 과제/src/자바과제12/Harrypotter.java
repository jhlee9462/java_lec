package 자바과제12;

import java.util.HashMap;

public class Harrypotter {

	private int num;
	private String firstname, lastname;
	
	public Harrypotter() {
	}

	public Harrypotter(int num, String firstname, String lastname) {
		this.num = num;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String toString() {
		return firstname + "\t" + lastname;
	}

	public int getNum() {
		return num;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, Harrypotter> hm = new HashMap<>();
		hm.put(101, new Harrypotter(101, "해리", "포터"));
		hm.put(102, new Harrypotter(102, "론", "위즐리"));
		hm.put(103, new Harrypotter(103, "헤르미온느", "그레인져"));
		
		System.out.println("이름\t성");
		System.out.println("---------------");
		for (Integer key : hm.keySet()) {
			System.out.println(hm.get(key).toString());
		}
	}
}
