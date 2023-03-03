package db4;

import static db4.JdbcTemplate.close;
import static db4.JdbcTemplate.commit;
import static db4.JdbcTemplate.getConnection;
import static db4.JdbcTemplate.rollback;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
//--------------------------------------------------PreparedStatement
//	public List<EmpEntity> addressList() {
//
//		String sql = "SELECT * FROM ADDRESSBOOK ORDER BY num";
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		List<EmpEntity> list = new ArrayList<>();
//
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
////			List를 null 로 초기화 할 경우
////			if (rs != null)
////				list = new ArrayList<>();
//			while (rs.next()) {
//				list.add(new EmpEntity(rs.getInt("num"), rs.getString("name"), rs.getString("phone"),
//						rs.getString("addr")));
//			}
//		} catch (SQLException e) {
//		} finally {
//			close(rs);
//			close(pstmt);
//			close(conn);
//		}
//
//		return list;
//	}
//	----------------------------------------------------Statement
	public List<EmpEntity> addressList() {

		String sql = "SELECT * FROM ADDRESSBOOK ORDER BY num";
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<EmpEntity> list = new ArrayList<>();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
//			List를 null 로 초기화 할 경우
//			if (rs != null)
//				list = new ArrayList<>();
			while (rs.next()) {
				list.add(new EmpEntity(rs.getInt("num"), rs.getString("name"), rs.getString("phone"),
						rs.getString("addr")));
			}
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(stmt);
			close(conn);
		}

		return list;
	}
//---------------------------------------------PreparedStatement
//	public int addressInsert(EmpEntity entity) {
//
//		int n = 0;
//		String sql = "INSERT INTO ADDRESSBOOK VALUES (NUM_SEQ.NEXTVAL, ?, ?, ?)";
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, entity.getName());
//			pstmt.setString(2, entity.getPhone());
//			pstmt.setString(3, entity.getAddr());
//			n = pstmt.executeUpdate();
//			if (n > 0) {
//				commit(conn);
//			}
//		} catch (SQLException e) {
//			rollback(conn);
//		} finally {
//			close(pstmt);
//			close(conn);
//		}
//
//		return n;
//	}
//-------------------------------------------------Statement
	public int addressInsert(EmpEntity entity) {

		int n = 0;
		String sql = "INSERT INTO ADDRESSBOOK VALUES (NUM_SEQ.NEXTVAL, '" + entity.getName() + "', '" + entity.getPhone() + "', '" + entity.getAddr() + "')";
		Connection conn = getConnection();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			if (n > 0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(stmt);
			close(conn);
		}

		return n;
	}
//	--------------------------------------------------------PreparedStatement
//	public EmpEntity addressSearch(String name) {
//
//		EmpEntity entity = null;
//		String sql = "SELECT * FROM ADDRESSBOOK WHERE name = ?";
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			rs = pstmt.executeQuery();
//
//			if (rs.next()) {
//				entity = new EmpEntity();
//				entity.setNum(rs.getInt("num"));
//				entity.setName(rs.getString("name"));
//				entity.setPhone(rs.getString("phone"));
//				entity.setAddr(rs.getString("addr"));
//			}
//		} catch (SQLException e) {
//		} finally {
//			close(rs);
//			close(pstmt);
//			close(conn);
//		}
//
//		return entity;
//	}
//	----------------------------------------------Statement
	public EmpEntity addressSearch(String name) {

		EmpEntity entity = null;
		String sql = "SELECT * FROM ADDRESSBOOK WHERE name = '" + name + "'";
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				entity = new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
			}
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(stmt);
			close(conn);
		}

		return entity;
	}
// -----------------------------------------------------------PreparedStatement
//	public int addressUpdate(String name, String phone, String addr) {
//		
//		String sql = "UPDATE ADDRESSBOOK SET phone = ?, addr = ? WHERE name = ?";
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		int n = 0;
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setString(3, name);
//			n = pstmt.executeUpdate();
//			
//			if (n > 0)
//				commit(conn);
//		} catch (SQLException e) {
//			rollback(conn);
//		} finally {
//			close(pstmt);
//			close(conn);
//		}
//		
//		return n;
//	}
// -----------------------------------------------------------Statement
public int addressUpdate(String name, String phone, String addr) {
		
		String sql = "UPDATE ADDRESSBOOK SET phone = '" + phone + "', addr = '" + addr + "' WHERE name = '" + name + "'";
		Connection conn = getConnection();
		Statement stmt = null;
		int n = 0;
		
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			
			if (n > 0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(stmt);
			close(conn);
		}
		
		return n;
	}
// ------------------------------------------PreparedStatement
//	public int addressDelete(String name) {
//		
//		String sql = "DELETE ADDRESSBOOK WHERE name = ?";
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		int n = 0;
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			n = pstmt.executeUpdate();
//			
//			if (n > 0)
//				commit(conn);
//		} catch (SQLException e) {
//			rollback(conn);
//		} finally {
//			close(pstmt);
//			close(conn);
//		}
//		
//		return n;
//	}
// -----------------------------------------Statement
public int addressDelete(String name) {
	
	String sql = "DELETE ADDRESSBOOK WHERE name = '" + name + "'";
	Connection conn = getConnection();
	Statement stmt = null;
	int n = 0;
	
	try {
		stmt = conn.createStatement();
		n = stmt.executeUpdate(sql);
		
		if (n > 0)
			commit(conn);
	} catch (SQLException e) {
		rollback(conn);
	} finally {
		close(stmt);
		close(conn);
	}
	
	return n;
}
}
