package ex14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test02 {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "EDU", "1234");
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 설치 불가");
		} catch (SQLException e) {
			System.out.println("conn 객체 생성 불가");
		}

		String sql = "SELECT PDSUBNAME, PDCOST, PDPRICE FROM PRODUCT WHERE \r\n"
				+ "	PDCOST > ANY (SELECT PDCOST FROM PRODUCT WHERE PDNAME = 'TV') AND\r\n"
				+ "	PDCOST < ANY (SELECT PDCOST FROM PRODUCT WHERE PDNAME = 'CELLPHONE')";

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("제품명\t\t제품원가\t제품가격");
			System.out.println("--------------------------------------");
			while (rs.next()) {
				System.out.print(rs.getString("PDSUBNAME") + "\t");
				System.out.print(rs.getInt("PDCOST") + "\t");
				System.out.println(rs.getInt("PDPRICE"));
			}
		} catch (SQLException e) {
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (!conn.isClosed() || conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

}
