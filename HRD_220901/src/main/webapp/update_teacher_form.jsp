<%@page import="com.it.hrd.ClassVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.hrd.ClassDAO"/>  
<% 
	String teacher_seq = request.getParameter("teacher_seq");
	ClassVO vo = dao.getOneTeacher(teacher_seq); 
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/class.js"></script>
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>

<section>
	<h3>교사 정보 수정</h3>
	
	<form action="update_teacher_impl.jsp" method="get" name="frm">
		<table border="1">
			<tr>
				<th>순번</th>
				<td><input type="text" name="teacher_seq" value="<%=vo.getTeacher_seq()%>" readonly="readonly"></td>
			</tr>		
			<tr>
				<th>교사코드</th>
				<td><input type="text" name="teacher_code" value="<%=vo.getTeacher_code()%>"></td>
			</tr>		
			<tr>
				<th>담당과정명</th>
				<td><input type="text" name="class_name" value="<%=vo.getClass_name()%>"></td>
			</tr>		
			<tr>
				<th>교사명</th>
				<td><input type="text" name="teacher_name" value="<%=vo.getTeacher_name()%>"></td>
			</tr>		
			<tr>
				<th>배정금액</th>
				<td><input type="text" name="class_price" value="<%=vo.getClass_price()%>"></td>
			</tr>		
			<tr>
				<th>등록일</th>
				<td><input type="text" name="teacher_regist_date" value="<%=vo.getTeacher_regist_date()%>"></td>
			</tr>		
			<tr>
				<td colspan="2">
					<input type="submit" value="수정" onclick="return InsetClassCheck()">
					<input type="button" value="삭제" onclick="location.href='delete_teacher_impl.jsp?teacher_seq=<%=vo.getTeacher_seq()%>'">
					<input type="button" value="목록" onclick="location.href='teacherList.jsp'">
				</td>
			</tr>		
		</table>
		
	</form>
</section>

<%@include file="footer.jsp" %>
</body>
</html>