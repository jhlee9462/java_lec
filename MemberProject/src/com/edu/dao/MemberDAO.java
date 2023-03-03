package com.edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.edu.entity.MemberEntity;
import static common.MyConnectionPool.*;

public class MemberDAO {

	public ArrayList<MemberEntity> getMemberList() {
		ArrayList<MemberEntity> list = new ArrayList<>();
		
		String sql = "SELECT * FROM MEMBER";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while (rs.next()) {
				list.add(new MemberEntity(rs.getInt("idx"), rs.getString("name"), rs.getString("phone")));
			}
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return list;
	}
	
	public MemberEntity getMember(String name) {
		
		String sql = "SELECT * FROM MEMBER WHERE name = '" + name + "'";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberEntity entity = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			rs.next();
			entity = new MemberEntity(rs.getInt("idx"), rs.getString("name"), rs.getString("phone"));
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return entity;
	}
	
	public int insertMember(MemberEntity ob) {
		
		String sql = "INSERT INTO MEMBER VALUES (mp_idx.NEXTVAL, '" + ob.getName() + "', '" + ob.getPhone() + "')";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
			
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
		
		return n;
	}
	
	public int deleteMemeber(String name) {
		
		String sql = "DELETE MEMBER WHERE name = '" + name + "'";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			n = pstmt.executeUpdate();
			
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
		
		return n;
	}
}
