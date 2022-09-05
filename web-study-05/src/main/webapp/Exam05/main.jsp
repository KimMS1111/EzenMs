<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] ck =request.getCookies();

	if(ck != null){
		for(Cookie c : ck) {
			if(c.getName().equals("username")) 
				out.print(c.getValue());
	}

%>

	님 안녕하세요!<br>
	저희 홈페이지에 방문해 주셔서 감사합니다.<br><br>
	<form action="logout.jsp" method="post">
	<input type="submit" value="로그아웃">
	</form>	

<%

	}else{

%>

	<h2> 로그인에 실패했습니다. </h2>
	<p><a href="loginForm.jsp"> 되돌아가기 </a>

<% 		

	}

%>
	





</body>
</html>