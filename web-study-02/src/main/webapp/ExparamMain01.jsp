<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" >
function check(){
	
	if (document.frm.name.value == "") {
		alert("이름을 입력해주세요.");
		document.frm.name.focus();
		return false;
	}else if (document.frm.age.value == "") {
		alert("생년월일을 입력해주세요.");
		document.frm.age.focus();
		return false;
	/* }else if (isNaN(document.frm.age.value)) {
		alert("생년월일을 숫자로 입력해주세요.");
		document.frm.age.focus();
		return false; */
	}else if (document.frm.userid.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.userid.focus();
		return false;	
	}else if (document.frm.userpw.value == "") {
		alert("비밀번호를 입력해주세요.");
		document.frm.userpw.focus();
		return false;
	}else if (isNaN(document.frm.userpw.value)) {
		alert("비밀번호 숫자로 입력해주세요.");
		document.frm.userpw.focus();
		return false;
	}else {
		return true;
	}
}
	function test() {
		var pw = document.getElementById('userpw').value;
		var pwc = document.getElementById('userpwc').value;
		
		if(pw != pwc){
			alert("비밀번호가 일치하지 않습니다.");
			return false;
		}else{
			alert("비밀번호가 일치합니다.");
			return true;
		}
	}
</script>
</head>
<body>
	<form action="ExParamTest01.jsp" method="post" name="frm">
		<label for="name"> 이름 :</label>
		<input type="text" name="name" id="name"><br>
		
		<label for="생년월일"> 생년월일 :</label>
		<input type="text" name="age" id="age"><br>
		
		<label for="id"> 아이디 :</label>
		<input type="text" name="userid" id="userid"><br>
		
		<label for="password"> 비밀번호 :</label>
		<input type="password" name="userpw" id="userpw"><br>
		
		<label for="passwordCheck"> 비밀번호 확인 :</label>
		<input type="password" name="userpwc" id="userpwc">
		<input type="button" onclick="test()" value="확인"><br>
		
		<input type="reset" value="초기화">
		<input type="submit" value="회원가입" onclick="return check()">
		
	</form>
</body>
</html>