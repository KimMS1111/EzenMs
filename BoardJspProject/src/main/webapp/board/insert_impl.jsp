<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.dao.*"%>

<jsp:useBean id="dao" class="com.it.dao.BoardDAO"/>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="vo" class="com.it.dao.BoardVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	dao.boardInsert(vo);
	response.sendRedirect("list.jsp");
%>
<!-- 위 아래 둘 다 가능  -->
<%-- <%
	BoardVO vo = new BoardVO();
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	String pwd = request.getParameter("pwd");
	
	vo.setName(name);
	vo.setSubject(subject);
	vo.setContent(content);
	vo.setPwd(pwd);
	
	//DAO 연결
	BoardDAO dao2 = new BoardDAO();
	dao2.boardInsert(vo);
	
	response.sendRedirect("list.jsp");
%>
 --%>