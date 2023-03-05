package ex10;

public class Coffee {

	private String name;
	private int price;
	
	public Coffee() {
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return name + "\t" + price;
	}
	
}
