<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = "pinksung";
String pwd = "1234";
String name = "성윤정";

if(id.equals(request.getParameter("id")) &&
		pwd.equals(request.getParameter("pwd"))){
		Cookie c = new Cookie("username", name);
		c.setMaxAge(24*60*60);
		response.addCookie(c);
		response.addCookie(new Cookie("id","pinksung"));
		response.addCookie(new Cookie("pwd","1234"));
%>
<h2> 성공적으로 로그인하셨습니다. </h2>
<p><a href="main.jsp"> 들어가기 </a>
<%
}else{
%>
<h2> 로그인에 실패했습니다. </h2>
<p><a href="loginForm.jsp"> 되돌아가기 </a>
<%
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