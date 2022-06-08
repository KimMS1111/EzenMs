<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Connection" %>
<%@ page import="com.project.dao.ProjectDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ProjectDAO pDao = ProjectDAO.getInstance();
	Connection conn = pDao.getConnection();
	out.println("DBCP연동 성공");
%>

</body>
</html>