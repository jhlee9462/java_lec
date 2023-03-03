package ex14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FactoryDAO {

	public void getFactoryAll(Connection conn) {
		
		String sql = "SELECT * FROM FACTORY";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("공장번호\t공장명\t\t공장위치");
			System.out.println("-----------------------------------");
			while (rs.next()) {
				System.out.print(rs.getInt("factno") + "\t");
				System.out.print(rs.getString("facname") + "\t");
				System.out.println(rs.getString("facloc"));
			}
		} catch (SQLException e) {
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
			}
		}
	}
	
}
