package ex7;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		double sum = 0.0;
		
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100 + 1);
			map.put(i + 1, num);
		}
		
		for (int i = 0; i < map.size(); i++) {
			System.out.print(map.get(i + 1) + " ");
		}
		System.out.println();
		
		for (int i = 0; i < map.size(); i++) {
			sum += map.get(i + 1);
		}
		System.out.printf("합계 : %.2f\n", sum);
		System.out.printf("평균 : %.2f\n", sum / map.size());
	}

}
