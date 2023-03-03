package ex10;

public class Cafe {

	private Coffee[] coffeeList = new Coffee[3];
	private int index = 0;
	
	public Cafe() {
	}
	
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < coffeeList.length; i++) {
			total += coffeeList[i].getPrice();
		}
		return total;
	}
	
	public void setCoffee(Coffee coffee) {
		if (index == 3) {
			System.out.println("더 이상 저장할 수 없습니다");
			 return;
		}
		
		coffeeList[index++] = coffee;
	}

	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
	
}
