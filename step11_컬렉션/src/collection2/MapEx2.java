package collection2;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("해리포터", Integer.valueOf(95));
		map.put("헤르미온느", Integer.valueOf(85));
		map.put("론", Integer.valueOf(73));
		map.put("네빌롱바텀", Integer.valueOf(77));
		map.put("볼드모트", Integer.valueOf(88));
		map.put("말포이", Integer.valueOf(50));
		map.put(null, Integer.valueOf(45)); // 키에 null 허용
		map.put("둘리", null);				// 밸류에 null 허용
		map.put("네빌롱바텀", Integer.valueOf(66));
		map.put(null, Integer.valueOf(55));
		
		System.out.println(map);
		
		Integer score = map.get("볼드모트");
		System.out.println(score);
		
		System.out.println(map.get(null));
	}

}
