package example30;

public class BookShop {
	private String bname, author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public void viewBook() {
		System.out.println("책이름 : " + bname);
		System.out.println("저 자 : " + author);
		System.out.println("가 격 : " + price);
	}

	public String getBname() {
		return bname;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
