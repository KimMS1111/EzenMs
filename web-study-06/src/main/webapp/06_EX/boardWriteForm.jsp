<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h3>게시판 글쓰기</h3>
<form action="boardWrite.jsp" method="post">
<table border="1">
	<tr>
		<td>작성자</td>
		<td><input type="text" name="name" size="20"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="pw" size="20"> ( 게시물 수정 삭제시 필요합니다. )</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="text" name="eamil" size="30"></td>
	</tr>
	<tr>
		<td>글 제목</td>
		<td><input type="text" name="title" size="60"></td>
	</tr>
	<tr>
		<td >글 내용</td>
		<td><textarea rows="10" cols="70" name="con"></textarea>
	</tr>
</table>
		<p><input type="submit" value="등록">
		<input type="reset" value="다시 작성">
</form>

</body>
</html>