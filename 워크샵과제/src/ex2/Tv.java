package ex2;

public class Tv {
	
	private String name;
	private int price;
	private String description;
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Tv() {}
	
	public Tv(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public String toString() {
		return name + "\t\t" + price + "\t\t" + description;
	}
}
