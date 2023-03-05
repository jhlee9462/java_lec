package ex4;

class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {
	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		return bookPrice * (100 - bookDiscountRate) / 100;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
}

public class Test06 {

	public static void main(String[] args) {
		
		Book[] books = { new Book("SQL Plus", 50000, 5.0), new Book("Java 2.0", 40000, 3.0), new Book("JSP Servlet", 60000, 6.0) };
		
		System.out.println("책이름\t\t가격\t할인울\t할인후금액");
		System.out.println("----------------------------------------");
		for (Book book : books) 
			System.out.println(book.getBookName() + "\t" + book.getBookPrice() + "원\t" + book.getBookDiscountRate() + "%\t" + book.getDiscountBookPrice() + "원");
	}

}
