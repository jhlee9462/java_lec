package interfaceex;

interface Cryable {
	abstract public void cry();
}

interface Flyable {
	abstract public void fly();
}

class Eagle implements Flyable, Cryable {

	@Override
	public void cry() {
		System.out.println("까~악~~");
	}

	@Override
	public void fly() {
		System.out.println("독수리가 날아다녀요..");
	}

}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Eagle ob = new Eagle();
		ob.cry();
		ob.fly();
	}

}

//-------------------------------abstract class
//abstract class Cryable {
//	abstract public void cry();
//}
//
//abstract class Flyable {
//	abstract public void fly();
//}
//
//class Eagle extends Flyable {
//
//	@Override
//	public void fly() {
//		System.out.println("독수리가 날아다녀요~"); // 2
//		new CryableEx().cry(); // 3
//	}
//	
//	class CryableEx extends Cryable {
//
//		@Override
//		public void cry() {
//			System.out.println("까~악~~"); // 4
//		}
//		
//	}
//}
//
//public class InterfaceEx2 {
//
//	public static void main(String[] args) {
//		new Eagle().fly(); // 1
//	}
//
//}
