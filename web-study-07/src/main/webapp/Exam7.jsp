<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Exam7login.jsp" method="post">
		<label for="userid">아아디 : </label>
		<input type="text" name="id" id="id"><br>
		
		<label for="userpswd">암 &nbsp; 호 : </label>
		<input type="password" name="pswd" id="userpswd"><br>
		
		<input type="radio" name="logincheck" value="i" checked>사용자
		<input type="radio" name="logincheck" value="m">관리자<br>
		
		<input type="submit" value="로그인">
	</form>
</body>
</html>