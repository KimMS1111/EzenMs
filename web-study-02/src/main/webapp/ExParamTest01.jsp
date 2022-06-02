<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>회원가입 성공!!</h3>
	이름 : <%=request.getParameter("name")%><br>
	생년월일 : <%=request.getParameter("age")%><br>
	아이디 : <%=request.getParameter("userid") %><br>
	비밀번호 : <%=request.getParameter("userpw") %><br>
	비밀번호 확인 : <%=request.getParameter("userpwc") %>
	
</body>
</html>