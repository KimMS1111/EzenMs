<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>정보 입력 폼</h1>
	<form action="itemWriteResult.jsp" method="post">
		<table>
			<tr>
				<th>상품명</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<th>상품설명</th>
				<td><textarea rows="5" cols="50" name="description"></textarea></td>
			</tr>
		</table>
			<input type="submit" value="전송">
			<input type="reset" value="취소">
	</form>
</body>
</html>