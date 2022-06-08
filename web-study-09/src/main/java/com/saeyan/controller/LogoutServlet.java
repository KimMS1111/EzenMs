package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

@WebServlet("/logout.do")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		RequestDispatcher dis = request.getRequestDispatcher("member/login.jsp");
		dis.forward(request, response);
		
//		service(request, response) // 이렇게 사용가능
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
//		service(request, response) // 이렇게 사용가능
	}
	
	@Override								//request				 //response
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		session.invalidate();
//		
//		RequestDispatcher dis = request.getRequestDispatcher("member/login.jsp");
//		dis.forward(request, response); // 이렇게 사용할때는 super 지우고 주석처럼 바꿔주기
		super.service(arg0, arg1);
	}
	
}
