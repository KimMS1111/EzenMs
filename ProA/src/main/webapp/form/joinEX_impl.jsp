<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.project.dao.*"%>

<jsp:useBean id="dao" class="com.project.dao.ProjectDAO"/>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="vo" class="com.project.dto.ProjectVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	dao.joinInsert(vo);
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