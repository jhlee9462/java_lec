package ex14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryBiz {

	private String driver, url, user, pass;
	
	public FactoryBiz() {
	}
	
	public FactoryBiz(String driver, String url, String user, String pass) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	
	public void getFactoryAll() {
		
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
		
		FactoryDAO fd = new FactoryDAO();
		fd.getFactoryAll(conn);

		try {
			if (!conn.isClosed() || conn != null)
				conn.close();
		} catch (SQLException e) {
		}
	}
	
}
