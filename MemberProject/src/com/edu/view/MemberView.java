package com.edu.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.edu.entity.MemberEntity;
import static common.MyConnectionPool.*;

public class MemberView {

	public void view(MemberEntity ob) {
		System.out.println(ob.getName() + "\t" + ob.getPhone());
	}
	
	public int nextSeq() {
		
		String sql = "SELECT last_number FROM USER_SEQUENCES WHERE sequence_name = 'MP_IDX'";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int seq = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			rs.next();
			seq = rs.getInt("last_number");
		} catch (SQLException e) {
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return seq;
	}
}
