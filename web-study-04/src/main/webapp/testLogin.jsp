<%@page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String id = "pinksung";
String pwd = "1234";
String name = "성윤정";

if(id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))){
	response.sendRedirect("main.jsp?name="+URLEncoder.encode(name, "UTF-8"));
}
else{
	response.sendRedirect("loginForm.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>