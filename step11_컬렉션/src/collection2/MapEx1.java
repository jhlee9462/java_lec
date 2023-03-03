package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map : 키 벨류 형식의 저장 방식을 가지는 컨테이너
// Iterator 기능이 없음
public class MapEx1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "둘리"); // put() map 에 데이터를 추가하는 함수
		map.put(201, "도우너");
		map.put(301, "마이콜");
		map.put(401, "또치");

		System.out.println("Key : " + 101 + " value : " + map.get(101));
		System.out.println("Key : " + 201 + " value : " + map.get(201));
		System.out.println("Key : " + 301 + " value : " + map.get(301));
		System.out.println("Key : " + 401 + " value : " + map.get(401));
		System.out.println("Key : " + 501 + " value : " + map.get(501));

		// get(key) : 밸류를 리턴, 값이 없으면 null을 리턴
//		map.remove(401);
//		System.out.println("Key : " + 401 + " value : " + map.get(401));

//		map.clear();
//		System.out.println("Key : " + 101 + " value : " + map.get(101));
//		System.out.println("Key : " + 201 + " value : " + map.get(201));
//		System.out.println("Key : " + 301 + " value : " + map.get(301));
//		System.out.println("Key : " + 401 + " value : " + map.get(401));
//		System.out.println("Key : " + 501 + " value : " + map.get(501));
		
		Set<Integer> set = map.keySet();
		
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("1번", "이정후");
		map2.put("2번", "고영민");
		map2.put("3번", "김현수");
		map2.put("4번", "이대호");
		
		Set<String> set2 = map2.keySet(); // Set 에 저장되는 순서가 거꾸로 들어간다.
		
		Iterator<String> iterator2 = set2.iterator();
		while (iterator2.hasNext())
			System.out.println(iterator2.next());
	}

}
