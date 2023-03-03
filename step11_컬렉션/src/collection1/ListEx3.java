package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		Book bk1 = new Book("java", "둘리", 300);
		Book bk2 = new Book("jsp", "도우너", 200);
		Book bk3 = new Book("oracle", "마이콜", 100);
		
		List<Book> list = new ArrayList<>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		// for 문을 이용하여 출력해주세요
		/* 책이름 : java 		책저자 : 둘리 		페이지 : 300
		 * 책이름 : jsp 		책저자 : 도우너 	페이지 : 200
		 * 책이름 : oracle 	책저자 : 마이콜 	페이지 : 100
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println("책이름 : " + list.get(i).getTitle() + "\t책저자 : " + list.get(i).getAuthor() + "\t페이지 : " + list.get(i).getPage());
		}
		
		System.out.println("-------------------------------------------");
		
		// 향상된 for 문
		for (Book ob : list) {
			System.out.println("책이름 : " + ob.getTitle() + "\t책저자 : " + ob.getAuthor() + "\t페이지 : " + ob.getPage());
		}
		
		System.out.println("-------------------------------------------");
		
		// iterator 를 이용하여 출력해주세요
		/* 책이름 : java 		책저자 : 둘리 		페이지 : 300
		 * 책이름 : jsp 		책저자 : 도우너 	페이지 : 200
		 * 책이름 : oracle 	책저자 : 마이콜 	페이지 : 100
		 */
		Iterator<Book> iterator = list.iterator();
		while (iterator.hasNext()) {
			Book temp = iterator.next();
			System.out.println("책이름 : " + temp.getTitle() + "\t책저자 : " + temp.getAuthor() + "\t페이지 : " + temp.getPage());
		}
	}

}
