package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Predicate;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.saeyan.dto.MemberVO;

public class MemberDAO {
	
	public MemberDAO() { }
	
	//싱글톤 패턴으로 객체 생성
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
		
	}
	
	public Connection getConnection() throws Exception {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		return conn;
	}

	public int userCheck(String userid, String pwd) {
		
		int result = -1;
		String sql = "select pwd from member where userid=?";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				
				if(rs.getString("pwd").equals(pwd) && rs.getString("pwd") != null) {
					result = 1; // userid, pwd 일치. 기존회원이라는 얘기
				}else {
					result = 0; // pwd 불일치
				}
			}else {
				result = -1; // 회원이 아님
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			
			try {
				
				if(rs != null) rs.close();
				if(pstm != null) pstm.close();
				if(conn != null) conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public MemberVO getMember(String userid) {
		
		MemberVO mVo = null;
		String sql = "select * from member where userid=?";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				mVo = new MemberVO();
				mVo.setName(rs.getString("name"));
				mVo.setUserid(rs.getString("userid"));
				mVo.setPwd(rs.getString("pwd"));
				mVo.setEmail(rs.getString("email"));
				mVo.setPhone(rs.getString("phone"));
				mVo.setAdmin(rs.getInt("admin"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstm != null)pstm.close();
				if(conn != null)conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return mVo;
	}

	public int confirmID(String userid) { // 중복체크
		
		int result = -1;
		String sql =  "select userid from member where userid=?";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				result = 1;  // 중복됨
			}else {
				result = -1; // 중복되지않음
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			 try {
				if(rs != null) rs.close();
				if(pstm != null)pstm.close();
				if(conn != null)conn.close();
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
		}
		return result;
	}
	

	public int insertMember(MemberVO mVo) {
		
		int result = -1;
		
		String sql = "insert into member(name, userid, pwd, email, phone, admin)"
					+"values(?,?,?,?,?,?)"; // 업데이트 전 무조건 오라클에 확인해볼것!!
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, mVo.getName());
			pstm.setString(2, mVo.getUserid());
			pstm.setString(3, mVo.getPwd());
			pstm.setString(4, mVo.getEmail());
			pstm.setString(5, mVo.getPhone());
			pstm.setInt(6, mVo.getAdmin());
			
			result = pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				if(pstm != null)pstm.close();
				if(conn != null)conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
		
		return result;
	}

	public void updateMember(MemberVO mVo) {
		
		int result = -1;
		
		String sql = "update member set pwd=?, email=?,"
					+"phone=?, admin=? where userid=?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, mVo.getPwd());
			pstm.setString(2, mVo.getEmail());
			pstm.setString(3, mVo.getPhone());
			pstm.setInt(4, mVo.getAdmin());
			pstm.setString(5, mVo.getUserid());
			
			result = pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				if(pstm != null)pstm.close();
				if(conn != null)conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
		
	}
}
