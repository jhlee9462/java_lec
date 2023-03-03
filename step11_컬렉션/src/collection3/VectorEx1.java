package collection3;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		Vector<Double> v = new Vector<>(3, 2); // 기본 크기 3으로 설정, 늘릴개수 2
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());
		
		v.add(100.3);
		v.add(3.14);
		v.add(50.5);
		v.add(95.6);
		
		System.out.println(v);
		
		double search = 3.14;
		int index = v.indexOf(search);
//		System.out.println(index);
		
		if (index != -1) // index 의 끝이 아닌가
			System.out.println(search + "의 위치가 " + (index + 1) + "번째에 있습니다.");
		else
			System.out.println(search + "은(는) 없습니다.");
		
//		-----------------------------------------------------------------------------
		
		double del = 3.14;
		if (v.contains(del)) {
			v.remove(del);
			System.out.println(del + "이(가) 삭제됨");
		}
		
		System.out.println(v);
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());
		v.trimToSize();
	}

}
