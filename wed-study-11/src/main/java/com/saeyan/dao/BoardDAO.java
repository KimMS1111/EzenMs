package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.BoardVO;

import util.DBManager;

public class BoardDAO {
	
	private BoardDAO() {
		
	}
	
	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		
		return instance;
		
	}

	public List<BoardVO> selectAllBoards() {
			String sql = "select * from board order by num desc";
			
			List<BoardVO> list = new ArrayList<BoardVO>();
			Connection conn = null;
			PreparedStatement pstmt = null;	
			ResultSet rs = null;
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					BoardVO bVo = new BoardVO();
					bVo.setNum(rs.getInt("num"));
					bVo.setPass(rs.getString("pass"));
					bVo.setName(rs.getString("name"));
					bVo.setEmail(rs.getString("email"));
					bVo.setTitle(rs.getString("title"));
					bVo.setContent(rs.getString("content"));
					bVo.setReadcount(rs.getInt("readcount"));
					bVo.setWritedate(rs.getTimestamp("writedate"));
					
					list.add(bVo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.closeConnection(conn, pstmt, rs);
			}
			
		return list;
	}

	public void insertBoard(BoardVO bVo) {
		String sql = "insert into board(num, name, email, pass, title, content) "
				+ "values(board_seq.nextval, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bVo.getName());
			pstmt.setString(2, bVo.getEmail());
			pstmt.setString(3, bVo.getPass());
			pstmt.setString(4, bVo.getTitle());
			pstmt.setString(5, bVo.getContent());
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt);
		}
		
	}
}

	
