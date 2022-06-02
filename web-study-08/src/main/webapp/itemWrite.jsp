<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"  %>

<%!
	Connection con=null;
	Statement stm = null;
	ResultSet rls = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "scott";
	String pass = "tiger";
	String sql = "select * from item";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	h3 {text-align: center; margin: 30px 0px 30px 0px;}
</style>
</head>
<body>
	<h3>입력 완료된 정보</h3>
<table class="table">
	<thead>
     	 <tr>
			<th>상품</th>
			<th>가격</th>
			<th>상품설명</th>
		</tr>
    </thead>
<%
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection(url, uid, pass);
	stm = con.createStatement();
	rls = stm.executeQuery(sql);
	while(rls.next()){
%>	
		<tbody>
			<tr class="table-info">
				<td><%=rls.getString("name") %>
				<td><%=rls.getString("price") %>
				<td><%=rls.getString("description") %>
			</tr>
		</tbody>
<%	
	}
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(rls != null) rls.close();
		if(stm != null) stm.close();
		if(con != null) con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>
</table>
</body>
</html>