package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx4 {

	public static void main(String[] args) {
		Book bk1 = new Book("java", "둘리", 300);
		Book bk2 = new Book("jsp", "도우너", 200);
		Book bk3 = new Book("oracle", "마이콜", 100);
		
		Map<String, Book> map = new HashMap<>();
		map.put(bk1.getTitle(), bk1);
		map.put(bk2.getTitle(), bk2);
		map.put(bk3.getTitle(), bk3);
//		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 도서명을 입력하세요 : ");
		String title = sc.next();
		
		if (map.get(title) == null)
			System.out.println("찾는 도서가 없어요.");
		else {
			System.out.println("책이름 : " + map.get(title).getTitle());
			System.out.println("책저자 : " + map.get(title).getAuthor());
			System.out.println("페이지 : " + map.get(title).getPage());
		}

		sc.close();
		
	}

}
