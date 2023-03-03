package example40;

import java.text.DecimalFormat;

public class Emp {

	String name = "홍길동";
	int salary = 32000000;
	
	public String getDisplay() {
		return "이름 : " + name + "\n연봉 : " + new DecimalFormat("###,###,###원").format(salary);
	}
	
}
