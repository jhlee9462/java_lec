package 자바과제12;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Test54 {

	public static void main(String[] args) {

		Map<String, Integer> ht = new HashMap<>();
		ht.put("콩쥐팥쥐", 15000);
		ht.put("백설공주", 10000);
		ht.put("보물섬", 18000);
		
		DecimalFormat df = new DecimalFormat("###,###");
		for (String key : ht.keySet()) {
			System.out.println(key + "의 책가격=" + df.format(ht.get(key)) + "원");
		}
	}

}
