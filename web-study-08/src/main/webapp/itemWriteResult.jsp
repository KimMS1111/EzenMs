<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<%!
	Connection con = null;
	PreparedStatement pstm = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "scott";
	String pass = "tiger";
	
	String sql = "insert into item values(?,?,?)";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

String name = request.getParameter("name");
String price = request.getParameter("price");
String description = request.getParameter("description");

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection(url, uid, pass);
	pstm = con.prepareStatement(sql);
	
	pstm.setString(1, name);
	pstm.setInt(2, Integer.parseInt(price));
	pstm.setString(3, description);
	
	pstm.executeUpdate();
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(pstm != null) pstm.close();
		if(con != null) con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>
<h3>정보 입력 완료</h3>
<a href="itemWrite.jsp">입력 완료된 정보</a>

</body>
</html>