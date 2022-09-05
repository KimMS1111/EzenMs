<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.hrd.ClassDAO"/>
<% String today = new SimpleDateFormat("YYYYMM").format(new Date()); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/teacher.js"></script>
<title>교사등록</title>
</head>
<body>
<%@include file="header.jsp" %>

<section>
<h3>교사 등록</h3>
	<form action="insert_teacher_impl.jsp" method="get" name="frmT">
		<table border="1">
			<tr>
				<th>순번</th>
				<td><input type="text" name="teacher_seq" value=<%=dao.getTeacherSeqNo()%> readonly="readonly"></td>
			</tr>		
			<tr>
				<th>교사코드</th>
				<td><input type="text" name="teacher_code"></td>
			</tr>		
			<tr>
				<th>담당과정명</th>
				<td><input type="text" name="class_name"></td>
			</tr>		
			<tr>
				<th>교사명</th>
				<td><input type="text" name="teacher_name"></td>
			</tr>		
			<tr>
				<th>배정금액</th>
				<td><input type="text" name="class_price"></td>
			</tr>		
			<tr>
				<th>등록일</th>
				<td><input type="text" name="teacher_regist_date" value="<%=today%>"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="등록" onclick="return InsetTeacherCheck()">
				</td>
			</tr>		
		</table>
		
	</form>
</section>

<%@include file="footer.jsp" %>
</body>
</html>