<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="com.it.hrd.ClassDAO"/>
<jsp:useBean id="vo" class="com.it.hrd.ClassVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>

<%
	int rs = dao.updateMember(vo);
	
	if(rs == 1){
%>
	<script>
		alert('수정이 완료 되었습니다.');
		location.href='memberList.jsp';
	</script>
<%
	}else{
%>
	<script>
		alert('수정이 실패했습니다.');
		history.back();
	</script>
<%}%>