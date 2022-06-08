<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인</h2>
	<form action="loginEX.do" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid" value="${userid}"></td>
			</tr>
			
			<tr>
				<td>암&nbsp;호</td>
				<td><input type="password" name="pwd" value="${pwd}"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"> 
					<input type="submit" value="로그인" >&nbsp;&nbsp;
					<input type="reset" value="취소">&nbsp;&nbsp;
					<input type="button" value="회원가입" onclick="loction.href='join.do'">				
				</td>
			</tr>
		</table>
	</form>
</body>
</html>