package ex14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "EDU", "1234");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			System.exit(1);
		} catch (SQLException e) {
			System.out.println("conn 객체 생성 실패");
			System.exit(1);
		}
		
		String sql = "SELECT PDNAME, PDSUBNAME, FACNAME, STONAME, NVL(STAMOUNT, 0) AS STAMOUNT "
				+ "FROM PRODUCT JOIN FACTORY USING (FACTNO) "
				+ "JOIN STORE USING (PDNO) WHERE FACLOC = 'SEOUL' "
				+ "AND (STAMOUNT = 0 OR STAMOUNT IS NULL)";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("제품카테고리\t제품명\t\t공장명\t\t판매점명\t판매점재고수량");
			System.out.println("-----------------------------------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getString("PDNAME") + "\t\t" + rs.getString("PDSUBNAME") + "\t" + rs.getString("FACNAME") + "\t" + rs.getString("STONAME") + "\t" + rs.getInt("STAMOUNT"));
			}
			
		} catch (SQLException e) {
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn.isClosed() || conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

}
