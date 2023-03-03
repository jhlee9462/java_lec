package ex2;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tvArray = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		
		for (Tv data : tvArray) {
			System.out.println(data.toString());
		}
		
		Tv minPrice = tvArray[0];
		Tv maxPrice = tvArray[0];
		
		for (int i = 0; i < tvArray.length; i++) {
			if (tvArray[i].getPrice() < minPrice.getPrice()) {
				minPrice = tvArray[i];
			}
			if (tvArray[i].getPrice() > maxPrice.getPrice()) {
				maxPrice = tvArray[i];
			}
		}
		
		System.out.println("가격이 가장 비싼 제품: " + maxPrice.getName());
		System.out.println("가격이 가장 저렴한 제품: " + minPrice.getName());
	}

}
