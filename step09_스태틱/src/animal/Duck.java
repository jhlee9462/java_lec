package animal;

public class Duck extends Animal {

	@Override
	public void speak() {
		System.out.println("꽥꽥");
	}
	
	@Override
	public void walk() {
		System.out.println("두발로 걸어다녀요");
	}
}
