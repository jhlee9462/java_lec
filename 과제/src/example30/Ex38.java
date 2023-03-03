package example30;

class Parent {
	String name;
	
	public Parent() {
		System.out.println("###인적사항###");
	}
	
	public Parent(String name) {
		this();
		this.name = name;
	}
	
	public void printView() {
		System.out.println("이름 : " + name);
	}
}

class Child extends Parent {
	int age;
	float tall;
	
	public Child(String name, int age, float tall) {
		super(name);
		this.age = age;
		this.tall = tall;
	}
	
	@Override
	public void printView() {
		super.printView();
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
	}
}

public class Ex38 {

	public static void main(String[] args) {
		new Child("민들래", 23, 165.3f).printView();
	}

}
