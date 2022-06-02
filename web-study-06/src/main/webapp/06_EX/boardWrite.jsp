<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="board" class="com.saeyan.javabeans.BoardBean"/>
<jsp:setProperty property="*" name="board"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>입력된 정보</h3>
		<table border="1">
			<tr>
				<td>작성자</td>
				<td><%=board.getName() %></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%=board.getPw() %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%=board.getEmail() %></td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td><%=board.getTitle() %></td>
			</tr>
			<tr>
				<td >글 내용</td>
				<td><textarea><%=board.getCon() %></textarea></td>
			</tr>
		</table>
</body>
</html>