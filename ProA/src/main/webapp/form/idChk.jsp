<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.project.dao.*"%>

<%
	String userid = request.getParameter("userid");
	boolean result = false;
	if(userid == null || userid.equals("")){ // userid 값이 없는 경우
		userid = "";
	}else{
		ProjectDAO pjd = new ProjectDAO();
		result = pjd.idChk(userid);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function setid(){
		opner.f1.userid.value = document.f1.userid.value;
		opner.f1.idChkre.value = "t";
		setid.close();
	}
</script>
</head>
<body>
	<form action="idChk.jsp" name="f1">
		<input type="text" name="userid" value="<%=userid%>">
		<input type="submit" value="검색">
	</form>
	<% if(userid.equals("")) {%>
	<% }else if(result == false){ // db의 결과값이 없으면 사용가능%>
		<a href="#" onclick="setid()">사용가능</a>
	<%}else { %>
		아이디 중복
	<%} %>
</body>
</html>