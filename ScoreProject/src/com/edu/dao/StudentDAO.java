package com.edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.edu.entity.Student;
import static common.JdbcTemplate.*;

public class StudentDAO {

	public ArrayList<Student> getStudentList() {
		
		String sql = "SELECT mid, kor, eng, mat, name, (kor + eng + mat), rownum FROM STUDENT ORDER BY 6";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Student> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Student(rs.getInt("mid"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), rs.getInt("rownum"), rs.getString("name")));
			}
			
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return list;
	}
	
	public Student getStudent(String name) {
		
		String sql = "SELECT * FROM STUDENT WHERE name = '" + name + "'";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Student entity = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			
			entity = new Student(rs.getInt("mid"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), 0, rs.getString("name"));
			
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return entity;
	}
	
	public int insertStudent(Student ob) {
		
		String sql = "INSERT INTO STUDENT VALUES (M_MID.NEXTVAL, '" + ob.getName() + "', " + ob.getKor() + ", " + ob.getEng() + ", " + ob.getMat() + ")";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
			if (n > 0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
	
	public int deleteStudent(String name) {
		
		String sql = "DELETE STUDENT WHERE name = '" + name + "'";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
			if (n > 0)
				commit(conn);
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
}
