package constructor;

public class ConstructorEx8 {

	public static void main(String[] args) {
		// 자바의정석, 김자바, 250 을 setter 로 대입
		// toString() 으로 출력
		// 자바의정석의 저자는 김자바이고 250페이지로 구성됨
		
		Book book = new Book();
		book.setTitle("자바의정석");
		book.setAuthor("김자바");
		book.setPage(250);
		System.out.println(book.toString());
		
		// 생성자에 jsp무조건따라하기, 이jp, 200 을 대입후 getter를 이용하여 출력
		// 책이름 : jsp무조건따라하기
		// 책저자 : 이jp
		// 페이지 : 200페이지
		
		Book book2 = new Book("jsp무조건따라하기", "이jp", 200);
		System.out.println("책이름 : " + book2.getTitle());
		System.out.println("책저자 : " + book2.getAuthor());
		System.out.println("페이지 : " + book2.getPage() + "페이지");
	}

}
