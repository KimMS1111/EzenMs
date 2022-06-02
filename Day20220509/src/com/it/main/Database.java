package com.it.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

	private Connection con; // mysql 연결
	private PreparedStatement pstmt; // sql 문장 전송 
	
	private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	
	
	//드라이버 등록 : 한번만 등록하면된다.
	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("등록은 잘 되니?");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL,"root","1234");
//			System.out.println("접속은 잘 되니?");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 연결해제
	public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 데이터
	public void mydbListData() {
		try {
			
			// 1. MySql연결
			getConnection();
			
			// 2. SQL 문장 작성
			String sql = "select * from member";
			
			// 3. MySql로 SQL문장 전송
			pstmt = con.prepareStatement(sql);
			
			// 4. 실행결과를 받아 온다.
			ResultSet rs = pstmt.executeQuery(); // db값을 출력
			
			// 5. 결과를 출력
			while(rs.next()) {
				System.out.println(rs.getInt(1) 
						+ ", " + rs.getString(2)
						+ ", " + rs.getString(3)
						+ ", " + rs.getString(4) + " ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	// 추가(Insert)
	
	public void mydbInsert(int no, String name, String sex, String content) {
		try {
			
			// 1. 연결
			getConnection();
			
			// 2 SQL문장 작성
			String sql = "insert into member(no, name, sex, content) "
					+ "values(?,?,?,?)";
			
			// 3. MySql로 SQL문장 전송
			pstmt = con.prepareStatement(sql);
			
			// 4. (?,?,?,?) 자리를 채운다.
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, sex);
			pstmt.setString(4, content);
			
			// 5. 실행
			pstmt.executeUpdate(); // db의 값을 변동/수정시에는 executeUpdate 사용
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
//	try {
//		
//	}catch(Exception e){
//		e.printStackTrace();
//	}finally {
//		disConnection();
//	}
	
	// 수정
	public void mydbUpdate(int no, String name1, String sex1, String content1) {
		try {
			getConnection();
			String sql = "update member set name=?, sex=?, content=? "
					+ "where no = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name1);
			pstmt.setString(2, sex1);
			pstmt.setString(1, content1);
			pstmt.setInt(4, no);
			
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	// 삭제
	public void mydbDelete(int no) {
		try {
			getConnection();
			String sql = "delete from member where no = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
	}
	
	// 검색
	public void mydbOneSelect(int no) {
		try {
			getConnection();
			String sql = "selete * from member where no = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1) 
					+ ", " + rs.getString(2)
					+ ", " + rs.getString(3)
					+ ", " + rs.getString(4) + " ");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	public static void main(String[] args) {
		Database db = new Database();
		db.getConnection();
		db.mydbListData();
		System.out.println("==================");
//		db.mydbInsert(13, "최원태", "남성", "키움투수");
		System.out.println("==================");
	}

}
