<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 객체생성 ==> MemberBean member = new MemberBean() -->
<jsp:useBean id="member" class="com.saeyan.javabeans.MemberBean"/>

<p>자바 빈 객체 생성 후 저장된 정보 출력하기</p><br><br>
이름:<%=member.getName() %><br>
아이디:<%=member.getUserid() %>
<hr>

<h1>정보 번경 후 변경된 정보 출력하기</h1>
<%
member.setName("전수빈");
member.setUserid("pinksubin");
%>
이름:<%=member.getName() %><br>
아이디:<%=member.getUserid() %>
</body>
</html>