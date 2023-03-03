package ex12;

import java.text.DecimalFormat;

public class ConvertString {

	public String convert(int money) {
		DecimalFormat df = new DecimalFormat("###,###원");
		return df.format(money);
	}
	
}
