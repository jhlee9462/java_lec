package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : 중복허용 o, 순서유지 o
// 배열과 비슷, 담을 수 있는 값의 수가 자동으로 증가되는 컨테이너 (collections framework)
// 서로 다른 자료형의 연속된 기억공간
public class ListEx1 {

	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4); // 4 --> Integer.valueOf(4) 자동 박싱
		list.add(Integer.valueOf(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add(5.0f);

//		System.out.println(list);
		for (int i = list.size(); i < 1000000; i++) {
			list.add(i);
		}

//		for (int i = 0; i < list.size(); i++) {
//			// size() 리스트에 있는 데이터의 개수를 리턴
//			System.out.println(list.get(i));
//			// get(index) 인덱스에 해당하는 값을 리턴
//		}
		System.out.println("-----------------------------------");

//		list.remove("second"); // 객체로 삭제, 인덱스 번호로 삭제도 가능
		double _start = System.currentTimeMillis();
		for (Object x : list) {
			Object x1 = x;
		}
		double _end = System.currentTimeMillis();
		System.out.println("향상된 for 문의 소요시간 : " + (_end - _start));
		System.out.println("------------------------------------------------");

		Iterator iter = list.iterator();
		double start = System.currentTimeMillis();
		while (iter.hasNext()) {
			Object y = iter.next();
		}
		System.out.println();
		double end = System.currentTimeMillis();

		System.out.println("iterator의 소요시간 : " + (end - start));

		double __start = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			// size() 리스트에 있는 데이터의 개수를 리턴
			Object x = list.get(i);
			// get(index) 인덱스에 해당하는 값을 리턴
		}
		double __end = System.currentTimeMillis();
		System.out.println("일반 for 문의 소요시간 : " + (__end - __start));
	}

}
