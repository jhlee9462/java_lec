package 자바과제12;

import java.util.Hashtable;
import java.util.Scanner;

public class PhoneBook {

	private String phone, address;

	public PhoneBook(String phone, String address) {
		super();
		this.phone = phone;
		this.address = address;
	}
	
	public String toString() {
		return "연락처: " + phone + "\n주소: " + address;
	}
	
	public static void main(String[] args) {
		
		Hashtable<String, PhoneBook> ht = new Hashtable<>();
		ht.put("홍길동", new PhoneBook("123-4567", "서울"));
		ht.put("이몽룡", new PhoneBook("345-3345", "대구"));
		ht.put("임꺽정", new PhoneBook("123-7890", "부산"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는 사람을 입력하시오: ");
		String key = sc.next();
		if (ht.keySet().contains(key)) {
			System.out.println(ht.get(key));
		} else {
			System.out.println("찾는 사람이 없다.");
		}
		
		sc.close();
	}
}
