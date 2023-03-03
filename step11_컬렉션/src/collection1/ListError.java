package collection1;

import java.util.ArrayList;
import java.util.List;

// 자료형의 변환 문제
public class ListError {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));
		list.add("겨울");
		list.add(40.0f);
		
		for (int i = 0; i < list.size(); i++) {
			String season = (String) list.get(i);
			System.out.println(season);
		}
	}

}
