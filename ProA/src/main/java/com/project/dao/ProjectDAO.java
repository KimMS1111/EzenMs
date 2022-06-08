package com.project.dao;

//import java.sql.Connection;
//import javax.sql.DataSource;
//import javax.naming.InitialContext;
//import javax.naming.Context;
import java.sql.*;

import com.project.dto.ProjectVO;

public class ProjectDAO {
	
	private Connection conn = null; 
	private PreparedStatement ps = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "1234";
	
	// 드라이브 등록
	public ProjectDAO() {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 메모리 할당
			
		}catch(Exception e) {
			e.printStackTrace();
		}			
	}
	
	// MySQL 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// MySQL 해제
	public void disConnection() {
		try {
			if(ps != null)ps.close();
			if(conn != null)conn.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void joinInsert(ProjectVO vo) {
		try {
			// 1. 연결
			getConnection();
			// 2. SQL문장 작성
			String sql = "insert into JoinEX(userid, pwd, name, phone, email) "
						+"values(?,?,?,?,?)";
			
			ps = conn.prepareStatement(sql);
			
			// 3. 빈칸 채우기
			ps.setString(1, vo.getUserid());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getPhone());
			ps.setString(5, vo.getEmail());
			
			// 4. 실행
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	public boolean idChk(String userid) {
		boolean result = false;
		
		getConnection();
		
		String sql = "select userid from JoinEX where userid = ?";
		
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userid);
			rs = ps.executeQuery();
			if(rs.next()) {
				result = true;
			}else {
				result = false;
			}
			
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return result;
	}
//	private ProjectDAO() {
//		
//	}
//	
//	private static ProjectDAO instance = new ProjectDAO();
//	
//	public static ProjectDAO getInstance() {
//		
//		return instance;
//	}
//	
//	public Connection getConnection() throws Exception {
//		Connection conn = null;
//		
//		Context initContext = new InitialContext();
//		Context envContext = (Context)initContext.lookup("java:/comp/env");
//		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
//		conn = ds.getConnection();
//		
//		return conn;
//		
//	}
}
