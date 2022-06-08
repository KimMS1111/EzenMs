<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body {
		margin: 0;
		height: 100%;
		background:#FFFAEA;
		font-family: Dotum,'돋움',Helvetica,sans-serif;
	}
	#wrapper {
 	   position: relative;
    	height: 100%;
	}

	#content {
    	position: absolute;
    	left: 50%;
    	transform: translate(-50%);
    	width: 460px;
	}

	h3 {
	    margin: 19px 0 8px;
	    font-size: 14px;
	    font-weight: 700;
    }
	.box {
	    display: block;
	    width: 100%;
	    height: 51px;
	    border: solid 1px #dadada;
	    padding: 10px 14px 10px 14px;
	    box-sizing: border-box;
	    background: #fff;
	    position: relative;
	}
	
	input:focus {
 	   outline: none;
	}
	
	input {
 	   font-family: Dotum,'돋움',Helvetica,sans-serif;    
	}
	
	.p {
		display: block;
	   	position: relative;
	   	width: 100%;
		height: 29px;
	   	border: threeddarkshadow;
	    background: #fff;
	    font-size: 15px;
	}
</style>

<script type="text/javascript">

function joinform_check() {
	  //변수에 담아주기
	  var id = document.getElementById("id");
	  var pwd = document.getElementById("pwd1");
	  var pwd2 = document.getElementById("pwd2");
	  var name = document.getElementById("name");
	  var phone = document.getElementById("phone");
	  var email = document.getElementById("email");
	  var agree = document.getElementById("agree");

	  if (id.value == "") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
	    alert("아이디를 입력하세요.");
	    id.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
	  }
	  
	  var idEX = /^[a-zA-z0-9]{5,12}$/;
		
	  if(!idEX.test(id.value)) {
		alert("아이디는 영문 대/소문자+숫자 조합으로 5~12자리로 입력해야합니다.");
	  	return false;
	  }	

	  if (pwd1.value == "") {
	    alert("비밀번호를 입력하세요.");
	    pwd1.focus();
	    return false;
	  }

	  //비밀번호 영문자+숫자+특수조합(8~25자리 입력) 정규식
	  var pwdCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,25}$/;

	  if (!pwdCheck.test(pwd1.value)) {
	    alert("비밀번호는 영문자+숫자+특수문자 조합으로 8~25자리 사용해야 합니다.");
	    pwd1.focus();
	    return false;
	  }

	  if (pwd2.value !== pwd1.value) {
	    alert("비밀번호가 일치하지 않습니다..");
	    pwd2.focus();
	    return false;
	  }

	  if (name.value == "") {
	    alert("이름을 입력하세요.");
	    uname.focus();
	    return false;
	  };

	  var reg = /^[0-9]+/g; //숫자만 입력하는 정규식

	  if (!reg.test(phone.value)) {
	    alert("전화번호는 숫자만 입력할 수 있습니다.");
	    mobile.focus();
	    return false;
	  }

	  if (email.value == "") {
	    alert("이메일 주소를 입력하세요.");
	    email.focus();
	    return false;
	  }
	  
	  var email_EX = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,20}$/i;
		// >> / ~ /안에 있는 내용은 정규표현식 검증에 사용되는 패턴이 이 안에 위치함
		// >> / ~ /i 정규표현식에 사용된 패턴이 대소문자를 구분하지 않도록 i를 사용함
		// >> ^ 표시는 처음 시작하는 부분부터 일치한다는 표시
		// >> [0-9a-zA-Z] 하나의 문자가 [] 안에 위치한 규칙을 따른다는 것으로 숫자와 알파벳 소문자 대문자인 경우를 뜻함
	 	// >> * 이 기호는 0 또는 그 이상의 문자가 연속될 수 있음을 말함
	 	
	 if(!email_EX.test(email.value)) {
	 	alert("이메일 주소 확인 후 다시 작성해주시기 바랍니다.");
	 	email.focus();
	 	return false;
	 }

	 if (!agree.checked) { //체크박스 미체크시
	    alert("약관 동의를 체크하세요.");
	    agree.focus();
	    return false;
	  }
	
	 else {
	 		alert("회원가입이 완료되었습니다.");
	 		return true;
	 	}
	 	

	  //입력 값 전송
	  document.join_form.submit(); //유효성 검사의 포인트   
}
	
	 //아이디 중복체크 팝업창
	function id_check() {
	  //window.open("팝업될 문서 경로", "팝업될 문서 이름", "옵션");
	  window.open("idChk.jsp", "", "width=600, height=200, left=200, top=100");
	}

	/* //우편번호 검색 팝업창(현재 공백문서)
	function search_address() {
	  window.open("", "b", "width=600, height=300, left=200, top=100");
	} */
</script>
</head>
<body>
<div id="wrapper">

	<div id="content">
<h1>회원가입</h1>
	<form action="joinEX_impl.jsp" method="post" name="f1">

	<div>
		<h3 class="title">
			<label for="id">아이디</label>
		</h3>
		<span class="box_id">
			<input type="text" id="id" name="userid" maxlength="20" class="p">
			<button type="button" onclick="id_check()">중복확인</button>
		</span>
	</div>	
	
	<div>
		<h3 class="title">
			<label for="pwd">비밀번호</label>
		</h3>
		<span class="box_pass">
			<input type="password" id="pwd1" name="pwd" maxlength="20" class="p">
		</span>
	</div>
	
	<div>
		<h3 class="title">
			<label id="pwd_check">비밀번호 재확인</label>
		</h3>
		<span class="box_passCheck">
			<input type="password" id="pwd2" name="pwd2" maxlength="20" class="p">
		</span>
	</div>
	
	<div>
		<h3 class="title">
			<label for="name">이름</label>
		</h3>
		<span class="box_name">
			<input type="text" id="name" name="name" maxlength="20" class="p">
		</span>
	</div>
	
	<div>
		<h3 class="title">
			<label for="phone">휴대전화</label>
		</h3>
		<span class="box_phone">
			<input type="text" id="phone" name="phone" maxlength="13" placeholder="-까지 입력해주세요." class="p">
		</span>
	</div>
	
	<div>
		<h3 class="title">
			<label for="email">본인확인 이메일</label>
		</h3>
		<span class="box_email">
			<input type="text" id="email" name="email" maxlength="30" class="p">
		</span>
	</div>
	<div>
		<h3>
		<label for="agree">약관동의</label>
		</h3>
	<textarea class="box" style="color: #FFFEEC; height: 250px; margin: 30px 10px 20px 8px;" readonly="readonly">약관동의</textarea>
	</div>
			<div class="col-6 col-12-small">
				<input type="checkbox" id="agree" name="agree"> 
				<label for="agree">동의 (필수)</label>
			</div>
	<br><br>
	<div class="join" align="center">
		<input type="button" onclick="joinform_check();" value="가입하기" >
		<input type="reset"  onclick="history.back();" value="취소">
	</div>
	</form>
	</div>
</div>
</body>
</html>