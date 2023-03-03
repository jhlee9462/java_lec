package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 제너릭스
public class ListEx2 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));
		list.add("겨울");
		list.add(40.0f);
		list.add(5);
		
		for (Object ob : list) {
			System.out.println(ob);
		}
		
		Iterator<Object> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}

}
