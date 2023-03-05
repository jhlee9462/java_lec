package ex13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<String, Mobile> map = new HashMap<>();
		double sum = 0.0;
		
		Mobile m1 = new Mobile("LU6800", "Optimus 2X", 800000);
		Mobile m2 = new Mobile("SU6600", "Optimus Black", 900000);
		Mobile m3 = new Mobile("KU5700", "Optimus Big", 700000);
		Mobile m4 = new Mobile("SU7600", "Optimus Mach", 950000);
		
		map.put("LU6800", m1);
		map.put("SU6600", m2);
		map.put("KU5700", m3);
		map.put("SU7600", m4);
		
		Set<String> kset = map.keySet();
		for (String key : kset) {
			System.out.println(map.get(key).printInfo());
			sum += map.get(key).getPrice();
		}
		System.out.println("합계 : " + sum);
		System.out.println();
		sum = 0.0;
		
		for (String key : kset) {
			map.get(key).setPrice(map.get(key).getPrice() * 1.1);
		}
		
		System.out.println("가격 변경 후");
		for (String key : kset) {
			System.out.println(map.get(key).printInfo());
			sum += map.get(key).getPrice();
		}
		System.out.printf("합계 : %.1f\n", sum);
	}

}
