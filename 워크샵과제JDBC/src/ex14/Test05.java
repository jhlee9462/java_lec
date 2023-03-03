package ex14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test05 {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "EDU", "1234");
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드에 실패했습니다.");
		} catch (SQLException e) {
			System.out.println("conn 객체 생성에 실패했습니다.");
		}
		
		String sql = "DELETE FROM PRODUCT WHERE pdno IN (SELECT pdno FROM DISCARDED_PRODUCT)";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			int n = pstmt.executeUpdate();
			if (n > 0) {
				conn.commit();
				System.out.println(n + "개의 데이터가 정상적으로 DELETE 되었습니다.");
			} else {
				throw new SQLException();
			}
		} catch (SQLException e) {
			System.out.println("데이터 삭제에 실패했습니다.");
			try {
				conn.rollback();
			} catch (SQLException e1) {
			}
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (!conn.isClosed() || conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

}
