package db3;

import static db3.JdbcTemplate.close;
import static db3.JdbcTemplate.commit;
import static db3.JdbcTemplate.getConnection;
import static db3.JdbcTemplate.rollback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	public List<UserEntity> userList() {
		
		List<UserEntity> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection conn = getConnection();
		ResultSet rs = null;
		UserEntity entity = null;
		
		String sql = "SELECT * FROM USERINFO";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
			
				entity = new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getDouble("score"));
				
				list.add(entity);
			}
			
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return list;
	}

	public UserEntity selectUser(String id) {
		
		String sql = "SELECT * FROM USERINFO WHERE id = ?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserEntity entity = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				entity = new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getDouble("score"));
			}
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return entity;
	}

	public int insertUser(UserEntity userEntity) {
		
		String sql = "INSERT INTO USERINFO VALUES (stu_seq.NEXTVAL, ?, ?, ?, ?)";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userEntity.getId());
			pstmt.setString(2, userEntity.getPasswd());
			pstmt.setString(3, userEntity.getName());
			pstmt.setDouble(4, userEntity.getScore());
			result = pstmt.executeUpdate();
			
			if (result > 0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(pstmt);
			close(conn);
		}
		
		return result;
	}
}
