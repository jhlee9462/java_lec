package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static db2.JdbcTemplate.getConnection;
import static db2.JdbcTemplate.close;
import static db2.JdbcTemplate.commit;
import static db2.JdbcTemplate.rollback;

// dao : data access object
public class EmpDao {

	public void addressList() {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM ADDRESSBOOK ORDER BY NUM DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("name") + "\t" + rs.getString("phone") + "\t" + rs.getString("addr"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
	}

	public void addressInsert(String name, String phone, String addr) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO ADDRESSBOOK (num, name, phone, addr) VALUES (num_seq.NEXTVAL, '" + name + "', '"
				+ phone + "', '" + addr + "')";

		try {
			pstmt = conn.prepareStatement(sql);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 추가되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 추가에 실패했습니다.");
		} finally {
			close(pstmt);
			close(conn);
		}
	}

	public void addressUpdate(String name, String phone, String addr) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "UPDATE ADDRESSBOOK SET phone = '" + phone + "', addr = '" + addr + "' WHERE name = '" + name
				+ "'";
		try {
			pstmt = conn.prepareStatement(sql);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 수정되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 수정에 실패했습니다.");
		} finally {
			close(pstmt);
			close(conn);
		}
	}

	public void addressDelete(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE ADDRESSBOOK WHERE name = '" + name + "'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 삭제되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 삭제에 실패했습니다.");
		} finally {
			close(pstmt);
			close(conn);
		}
	}

	public boolean addresSearch(String name) {
		Connection conn = getConnection();
		boolean ck = false;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM ADDRESSBOOK WHERE name = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ck = true;
				System.out.println(rs.getString("name") + "\t" + rs.getString("phone") + "\t" + rs.getString("addr"));
			}
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return ck;
	}
}
