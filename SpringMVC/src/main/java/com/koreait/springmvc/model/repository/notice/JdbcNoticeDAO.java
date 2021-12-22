package com.koreait.springmvc.model.repository.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;

import com.koreait.springmvc.domain.Notice;
import com.koreait.springmvc.pool.PoolManager;

public class JdbcNoticeDAO implements NoticeDAO{
	private PoolManager pool;
	
	public void setPool(PoolManager pool) {
		this.pool = pool;
	}
	
	public List selectAll() {
		Connection con=pool.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		return null;
	}

	public int insert(Notice notice) {
		
		Connection con=pool.getConnection();
		PreparedStatement pstmt=null;
		int result=0;
		String sql="insert into notice(title, writer, content) values(?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,notice.getTitle());
			pstmt.setString(2,notice.getWriter());
			pstmt.setString(3,notice.getContent());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt);
		}
		return result;
	}

	public Notice select(int notice_id) {
		return null;
	}

	public int update(Notice notice) {
		return 0;
	}

	public int delete(int notice_id) {
		return 0;
	}

}
