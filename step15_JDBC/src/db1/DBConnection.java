package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* DB연결 과정
 * 1. 드라이버 로드 (ojdbc 로드)
 * 2. 연결 객체 생성
 * 3. sql 문장 실행
 * 4. 결과(ResultSet, 정수) 리턴
 * 5. 객체 닫기
 */
public class DBConnection {

	Connection conn = null;

	public DBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1. 드라이버 로드
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "EDU", "1234"); // 2. 연결 객체 생성

			conn.setAutoCommit(false);

			if (conn != null) {
				System.out.println("연결 성공!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	------------------------------------------------------------------------- Statement
	public void addressInsert(String name, String phone, String addr) {
		Statement stmt = null;
		String sql = "INSERT INTO ADDRESSBOOK (num, name, phone, addr) VALUES (num_seq.NEXTVAL, '" + name + "', '"
				+ phone + "', '" + addr + "')";
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 추가되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 추가에 실패하였습니다.");
			} catch (SQLException e1) {
			}

		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
//	-------------------------------------------------------------------------- PreparedStatment
//	public void addressInsert(String name, String phone, String addr) {
//		PreparedStatement pstmt = null;
//		
//		String sql = "INSERT INTO ADDRESSBOOK (num, name, phone, addr) VALUES (num_seq.NEXTVAL, ?, ?, ?)";
//		try {
//			
//			pstmt = conn.prepareStatement(sql);
//			// sql 문장을 db 에서 동작하는 pstmt 객체로 포장하는 작업
//			pstmt.setString(1, name);
//			pstmt.setString(2, phone);
//			pstmt.setString(3, addr);
//			int n = pstmt.executeUpdate();
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 추가되었습니다.");
//			}
//			
//		} catch (SQLException e) {
//			
//			try {
//				conn.rollback();
//				System.out.println("데이터 추가에 실패하였습니다.");
//			} catch (SQLException e1) {
//			}
//			
//		} finally {
//			try {
//				if (pstmt != null) {
//					pstmt.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

//	------------------------------------------------ Statement
	public void addressList() {

		String sql = "SELECT * FROM ADDRESSBOOK";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt("num") + "\t" + rs.getString("name") + "\t" + rs.getString("phone") + "\t"
						+ rs.getString("addr"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 연결객체 해제
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//	------------------------------------------------ PreparedStatment
//	public void addressList() {
//
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "SELECT * FROM ADDRESSBOOK"; // 3. SQL 문장 실행
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery(); // 4. 결과 리턴
//
//			while (rs.next()) {
//				System.out.println(rs.getInt("num") + "\t" + rs.getString("name") + "\t" + rs.getString("phone") + "\t"
//						+ rs.getString("addr"));
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//
//			try {
	// 5. 연결객체 해제
//				if (rs != null) {
//					rs.close();
//				}
//				if (pstmt != null) {
//					pstmt.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

//	-------------------------------------------------------------------PreparedStatement
//	public void addressUpdate(int num, String phone, String addr) {
//		PreparedStatement pstmt = null;
//
//		String sql = "UPDATE ADDRESSBOOK SET phone = ?, addr = ? WHERE num = ?";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setInt(3, num);
//			int n = pstmt.executeUpdate();
//
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 수정되었습니다.");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 수정에 실패하였습니다.");
//			} catch (SQLException e1) {
//			}
//
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//			} catch (SQLException e) {
//			}
//		}
//
//	}

//	---------------------------------------------------------------------- Statement
	public void addressUpdate(int num, String phone, String addr) {
		Statement stmt = null;

		String sql = "UPDATE ADDRESSBOOK SET phone = '" + phone + "', addr = '" + addr + "' WHERE num = " + num;
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 수정되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 수정에 실패하였습니다.");
			} catch (SQLException e1) {
			}
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
			}
		}

	}

//	-------------------------------------------------------------------------- PreparedStatement
//	public void addressDelete(int num) {
//		PreparedStatement pstmt = null;
//
//		String sql = "DELETE FROM ADDRESSBOOK WHERE num = ?";
//
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num);
//			int n = pstmt.executeUpdate();
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터 삭제에 성공하였습니다.");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 삭제에 실패하였습니다.");
//			} catch (SQLException e1) {
//			}
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//			} catch (SQLException e) {
//			}
//		}
//	}

//	------------------------------------------------------------------------------ Statement
	public void addressDelete(int num) {
		Statement stmt = null;

		String sql = "DELETE FROM ADDRESSBOOK WHERE num = " + num;
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터 삭제에 성공하였습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 삭제에 실패하였습니다.");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
			}
		}
	}
}
