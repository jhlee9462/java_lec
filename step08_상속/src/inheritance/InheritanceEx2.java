package inheritance;
// 생성자 연습
class ParentEx {
	public ParentEx() {
		System.out.println("parent class"); // 3
	}
}

class ChildEx extends ParentEx {
	public ChildEx() {
		super(); // 2
		System.out.println("child class"); // 4
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		ChildEx ob = new ChildEx(); // 1, 5
	}

}

/*
 	this.변수
 	this.메서드()
 	this()
 	this(인자, 인자, ...)	---	생성자 (자기 자신)
 	
 	super.변수
 	super.메서드()
 	super()
 	super(인자, 인자, ...) --- 생성자 (부모 클래스)
 */
