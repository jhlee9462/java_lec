package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set 중복허용 x, 순서유지 x
// 입력한 값들 중에서 고유한 값 하나만 저장하는 특성을 가지는 Collection

public class SetEx {
	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add(2); // 2 --> Integer.valueOf(2) 자동 박싱
		set.add(Integer.valueOf(3));
		set.add(new Integer(4));
		set.add(new Float(3));
		set.add(4.00); // 4.00 --> Double.valueOf(4.00) 자동 박싱
		set.add(new Integer(2));

		System.out.println(set);

		Iterator iter = set.iterator();
		// set 의 값을 가지는 Iterator 데이터 타입의 인스턴스 iter
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		System.out.println(iter.next() + "---------"); // 에러 발생 : 데이터에 더이상 접근할 수 없기 때문
		
		if (set.contains("one")) {
			System.out.println("데이터가 있습니다.");
		} else {
			System.out.println("데이터가 없어요");
		}
		
		System.out.println("set의 크기 : " + set.size());
		
	}

}
