<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	
	* { margin: auto;}
	
	body { text-align: center; background-color:}
	
	body > header { margin: 20px 0px 80px 0px; color:threedshadow;}
	
	body > div { margin: auto; width: 350px; height: 500px;}
	
	h4 { text-align: left; font-size: 16px; margin: 20px 30px 10px 0px; color:threedshadow;}
	
	.in { margin: auto; width: 350px; height: 30px; border-radius: 2px; border:1px solid;
		 border-color: threedface; display: block; position: relative;}
	
	.box { width: 108px; height: 30px; border-radius: 2px; border:1px solid; border-color: threedface;}
	
	.email_box {width: 160px; height: 30px; border-radius: 2px; border:1px solid; border-color: threedface;}
	
</style>

<script type="text/javascript">
function check(){
	
	if (document.frm.userid.value == "") {
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
	}else if (document.frm.name.value == "") {
		alert("이름을 입력해주세요.");
		document.frm.name.focus();
		return false;
	}else if (document.frm.age_yy.value == "") {
		alert("생년월일을 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if (isNaN(document.frm.age_yy.value)) {
		alert("년도를 숫자로 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if (document.frm.age_mm.value == "") {
		alert("월을 선택해주세요.");
		document.frm.age.focus();
		return false;
	}else if (document.frm.age_dd.value == "") {
		alert("일(날짜)을 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if (isNaN(document.frm.age_dd.value)) {
		alert("일(날짜)을 숫자로 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if (document.frm.gender.value == "") {
		alert("성별을 선택해주세요.");
		document.frm.gender.focus();
		return false;
	}else if (document.frm.number.value == "") {
		alert("휴대전화 번호를 입력해주세요.");
		document.frm.number.focus();
		return false;
	}else if (isNaN(document.frm.number.value)) {
		alert("숫자로 11자리 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if (document.frm.email.value == "") {
		alert("이메일을 입력해주세요.");
		document.frm.email.focus();
		return false;
	}else if (document.frm.email_address.value == "") {
		alert("이메일주소를 선택해주세요.");
		document.frm.emaill_address.focus();
		return false;
	}else if (document.frm.address.value == "") {
		alert("주소를 입력해주세요.");
		document.frm.address.focus();
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
<header><h1>회원가입</h1></header>
<div>
<form action="" method="post" name="frm">
			<div>
			<h4 class="join_titel"><label for="userid">아이디</label></h4>
				<input type="text" name="userid" id="userid" class="in" autofocus>
			</div>
			
			<div>
			<h4 class="join_titel"><label for="password">비밀번호</label></h4>
				<input type="password" name="userpw" id="userpw" class="in" autofocus>
			</div>
			
			<div>
			<h4 class="join_titel"><label for="passwordCheck">비밀번호 재확인</label></h4>
			<input type="password" name="userpwc" id="userpwc" class="in" autofocus><br>
			</div>
			
			<div>
			<h4 class="join_titel"><label for="name">이름</label></h4>
			<input type="text" name="name" id="name" class="in" autofocus>
			</div>

			<div>
			<h4 class="join_titel"><label for="age">생년월일</label></h4>
			<input type="text" name="age_yy" id="age" maxlength="4" placeholder="년(4자)" class="box"  autofocus>
			<select name="age_mm" class="box">
				<option value="">월</option>
				<option value="01">1</option>
				<option value="02">2</option>
				<option value="03">3</option>
				<option value="04">4</option>
				<option value="05">5</option>
				<option value="06">6</option>
				<option value="07">7</option>
				<option value="08">8</option>
				<option value="09">9</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
			</select>
			<input type="text" name="age_dd" id="age" maxlength="2" placeholder="일" class="box"  autofocus>
			</div>		
	
			<div>
		 	<h4 class="join_titel"><label for="gender">성별</label></h4>
			<select name="gender" id="gender" class="in" autofocus>
				<option value="" selected>성별</option>
				<option value="m">남자</option>
				<option value="f">여자</option>
			</select>
			</div>
	
			<div>
			<h4 class="join_titel"><label for="number">휴대전화</label></h4>
			<input type="text" name="number" id="number" maxlength="11" placeholder="-빼고 입력해주세요." class="in" autofocus>
			</div>

			<div>
			<h4 class="join_titel"><label for="email">이메일</label></h4>
			<input type="text" name="email" id="email" maxlength="30" class="email_box" autofocus>@
			<select name="email_address" class="email_box" autofocus>
				<option selected>주소를 선택하세요.</option>
				<option>naver.com</option>
				<option>daum.net</option>
				<option>nate.com</option>
				<option>google.com</option>
			</select>
			</div>		
			<div>
			<h4 class="join_titel"><label for="address">주소</label></h4>
			<input type="text" name="address" id="address" class="in" autofocus>
			</div>		
			
		<br><br><input type="button" value="가입하기" onclick="check()">
</form>
</div>
</body>
</html>