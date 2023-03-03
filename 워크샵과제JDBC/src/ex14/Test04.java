package ex14;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test04 {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "EDU", "1234");
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("conn 객체 생성 실패");
		}
		
		String sql1 = "SELECT PDNO, PDNAME, PDSUBNAME,"
				+ " FACTNO, PDDATE, PDCOST, PDPRICE,"
				+ " PDAMOUNT FROM PRODUCT JOIN FACTORY USING (FACTNO)"
				+ " WHERE FACLOC = 'CHANGWON'";
		
		String sql2 = "INSERT INTO DISCARDED_PRODUCT VALUES"
				+ " (?, ?, ?, ?, ?, ?, ?, ?, '" + new Date(new java.util.Date().getTime()) + "')";
		
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		
		try {
			pstmt1 = conn.prepareStatement(sql1);
			rs = pstmt1.executeQuery();
			int total = 0;
			
			while (rs.next()) {
				pstmt2 = conn.prepareStatement(sql2);
				pstmt2.setInt(1, rs.getInt(1));
				pstmt2.setString(2, rs.getString(2));
				pstmt2.setString(3, rs.getString(3));
				pstmt2.setString(4, rs.getString(4));
				pstmt2.setDate(5, rs.getDate(5));
				pstmt2.setInt(6, rs.getInt(6));
				pstmt2.setInt(7, rs.getInt(7));
				pstmt2.setInt(8, rs.getInt(8));
				
				int n = pstmt2.executeUpdate();
				if (n > 0) {
					conn.commit();
					total += n;
				} else {
					throw new SQLException();
				}
				
			}
			
			System.out.println(total + "개의 데이터가 정상적으로 INSERT 되었습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 추가에 실패했습니다.");
			try {
				conn.rollback();
			} catch (SQLException e1) {
			}
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (pstmt2 != null)
					pstmt2.close();
				if (!conn.isClosed() || conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
		
	}

}
