package inheritance;

// -----------------------------------------------------------3
class Branch {
	public Branch() {
		System.out.println("Branch dafault constructor"); // 5
	}
	
	public Branch(String str) {
		this(); // 4
		System.out.println(str + " Branch constructor"); // 6
	}
}

class Leaf extends Branch {
	public Leaf() {
		super("마바사"); // 3
		System.out.println("Leaf default constructor"); // 7
	}
	
	public Leaf(String str, int n) {
		this(); // 2
		System.out.println(str + " " + n + " Leaf constructor"); // 8
	}
	
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		Leaf ob = new Leaf("가나다", 10); // 1, 9
	}

}

// -----------------------------------------------------------2
//class Branch {
//	public Branch() {
//		System.out.println("Branch dafault constructor"); // 4
//	}
//	
//	public Branch(String str) {
//		this(); // 3
//		System.out.println(str + " Branch constructor"); // 5
//	}
//}
//
//class Leaf extends Branch {
//	public Leaf(String str) {
//		super(str); // 2
//		System.out.println(str + " Leaf constructor"); // 6
//	}
//	
//}
//
//public class InheritanceEx3 {
//
//	public static void main(String[] args) {
//		Leaf ob = new Leaf("hi~"); // 1, 7
//	}
//
//}

// -----------------------------------------------------------1
//class Branch {
//	public Branch() {
//		System.out.println("Branch dafault constructor"); // 4
//	}
//	
//	public Branch(String str) {
//		this(); // 3
//		System.out.println(str + " Branch constructor"); // 5
//	}
//}
//
//class Leaf extends Branch {
//	public Leaf() {
//		super("hi~"); // 2
//		System.out.println("Leaf default constructor"); // 6
//	}
//	
//}
//
//public class InheritanceEx3 {
//
//	public static void main(String[] args) {
//		Leaf ob = new Leaf(); // 1, 7
//	}
//
//}
