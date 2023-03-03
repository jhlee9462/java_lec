package example30;

public class Ex33 {

	public static void main(String[] args) {
		BookShop ob = new BookShop();
		ob.setBook("자바완성", "황완성", 25000);
		ob.viewBook();
		
		System.out.println();
		
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(3500);
		
		System.out.println("책이름 : " + ob.getBname());
		System.out.println("저 자 : " + ob.getAuthor());
		System.out.println("가 격 : " + ob.getPrice());
	}

}
