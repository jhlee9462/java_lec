package object;
// 클래스 다이어그램

/*	- private, + public, # protected
 * 클래스명 : Person
 * +name : String
 * +age : int
 * +score : float
 * 
 * +setPerson(n:String, a:int, s:float):void
 * +viewPerson():void
 * 
 */

class Person {
	public String name; // 변수, 멤버변수, 필드 field, 전역변수 (클래스 전체에서 사용할 수 있는 변수)
	public int age;
	public float score;

	public void setPerson(String n, int a, float s) { // 멤버함수, 메서드(method)
		name = n;
		age = a;
		score = s;
	}

	public void viewPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("점수 : " + score);
	}

}

public class ObjectEx1 {

	public static void main(String[] args) {
		Person ob1 = new Person(); // 객체 생성
		// new Person : 힙 영역에 메모리를 할당하고 인스턴스를 생성
		// 객체 : 일반적으로 인스턴스로 사용, 필드와 메서드의 조합
		ob1.setPerson("뽀로로", 23, 78.3f);
		ob1.viewPerson();
//		System.out.println(ob1.hashCode());
		// hashCode() : 객체의 참조주소를 10진 정수로 리턴
//		System.out.println(ob1);
		
		Person ob2 = new Person(); // 객체 생성
		ob2.setPerson("크롱", 20, 55.5f);
		ob2.viewPerson();
		System.out.println(ob2.hashCode());
//		ob2.name = "루피"; // 외부에서 변수에 직접 접근은 지양...
		ob2.viewPerson();
	}

}
