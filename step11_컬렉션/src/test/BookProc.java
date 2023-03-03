package test;

import java.util.ArrayList;

public class BookProc {

	public ArrayList<Book> getList() {
		
		Book bk1 = new Book("java", "둘리", 300);
		Book bk2 = new Book("jsp", "도우너", 200);
		Book bk3 = new Book("oracle", "마이콜", 100);
		/* list에 bk1, bk2, bk3를 저장하고 리턴하세요 */
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(bk1);
		books.add(bk2);
		books.add(bk3);
		
		return books;
	}

}
