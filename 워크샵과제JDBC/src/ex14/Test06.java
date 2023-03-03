package ex14;

public class Test06 {

	public static void main(String[] args) {
		
		FactoryBiz fb = new FactoryBiz("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@127.0.0.1:1521:xe", "EDU", "1234");
		
		fb.getFactoryAll();
	}

}
