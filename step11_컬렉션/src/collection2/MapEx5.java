package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx5 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("둘리", "객실4");
		map.put("또치", "객실1");
		map.put("마이콜", "객실3");
		map.put("도우너", "객실2");
		map.put("고길동", "객실5");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("방 이름을 입력하세요(객실1 ~ 객실5) : ");
		String room = sc.next();
		
		Set<String> col = map.keySet();
////		System.out.println(col);
//		for (String key : col) {
//			if (map.get(key).equals(room)) {
//				System.out.println(map.get(key) + "에 있는 사용자는 " + key + "입니다.");
//			}
//		}
		
		// 문제. 이터레이터를 이용하여 반복을 수행해 주세요
		Iterator<String> iterator = col.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (map.get(key).equals(room))
				System.out.println(map.get(key) + "에 있는 사용자는 " + key + "입니다.");
		}
	}

}
