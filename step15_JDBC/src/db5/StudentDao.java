package db5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static db5.JdbcTemplate.*;

public class StudentDao {

	public String insertStudent(StudentEntity entity) {
		
		Connection conn = getConnection();
		String sql = "INSERT INTO STUDENT VALUES (N_SQL.NEXTVAL, '" + entity.getName() + "', " + entity.getKor() + ", " + entity.getEng() + ", " + entity.getMat() 
					+ ")";  
		PreparedStatement pstmt = null;
		String result = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			int n = pstmt.executeUpdate();
			
			if (n > 0) {
				commit(conn);
				result = entity.getName() + "님이 추가 되었습니다.";
			}
		} catch (SQLException e) {
			rollback(conn);
			result = "학생 추가에 실패했습니다.";
		} finally {
			close(pstmt);
			close(conn);
		}
		
		return result;
	}
	
	public StudentEntity getStudent(String name) {
		
		Connection conn = getConnection();
		String sql = "SELECT * FROM STUDENT WHERE name = '" + name + "'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentEntity entity = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				entity = new StudentEntity(rs.getInt("num"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), rs.getString("name"));
			} 
			
		} catch (SQLException e) {
			System.out.println("찾으시는 이름의 학생이 없습니다.");
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return entity;
	}
	
	public List<StudentEntity> getStudentList() {
		
		Connection conn = getConnection();
		String sql = "SELECT * FROM STUDENT";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentEntity> list = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				close(rs);
				list = new ArrayList<>();
				rs = pstmt.executeQuery();
			}
			
			while (rs.next()) {
				list.add(new StudentEntity(rs.getInt("num"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), rs.getString("name")));
			}
			
		} catch (SQLException e) {
			System.out.println("리스트 호출에 실패하였습니다.");
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return list;
	}
	
}
