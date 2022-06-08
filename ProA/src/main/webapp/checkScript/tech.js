function checkID() {
	
	var userid = $('#userid').val();
 	
 	$.ajax({
 		type:'post',
 		url:"checkID.do?userid=" + userid,
 		data:userid,
 		success:function(result) {
 			cosole.log(result);
 			
 			$("#bad").hide();
 			$("#good").hide();
 			$("#inId").hide();
 			
 			//아이디 유효성
 			var idEX = /^[a-zA-z0-9]{4,12}$/;
 			
 			if(!idEX.test($("#userid").val())) {
 				alert("ajax_아이디는 영문 대/소문자와 숫자 4~12자리로 입력해야합니다.");
 				$("#userid").val("");
 				$("#userid").focus();
 			}else if(result == 'fail') {
 				$('#userid').val('');
	 			$("#userid").focus();
	 			$("#bad").show();
	 			$("#good").hide();
	 			$("#inId").hide();
	 		}else{
	 			if($('#userid').val() =="") {
		 			$("#bad").hide();
		 			$("#good").hide();
		 			$("#inId").show();
		 		}else{
		 			$('#idcheck').css('background-color', 'green');
		 			$("#bad").hide();
		 			$("#good").show();
		 			$("#inId").hide();
		 		}
		 	}
		 }
	})
}

var btn = document.querySelector('#confirm');
if(brn != null)
	btn.onclick = function() {
	  console.log("2");
	  var uid = document.getElementById("userid");
	  var pwd = document.getElementById("pwd");
	  var pwd_chk = document.getElementById("pwd_chk");
	  var name = document.getElementById("name");
	  var phone = document.getElementById("phone");
	  var email = document.getElementById("email");
	  var agree = $("input:checkbox[name='agree']").is(":checked");

	if(userid.value == "") {
		alert("아이디를 입력하세요");
		userid.focus();
		return false;
	}
	
	var idEX = /^[a-zA-z0-9]{4,12}$/;
	
	if(!idEX.test(userid.value)) {
		alert("아이디는 영문 대/소문자와 숫자 4~12자리로 입력해야합니다.");
		userid.focus();
		return false;
	}
	
	if(!$(".passId").is(":visible")) {
		alert("중복체크를 하시기 바랍니다.");
		document.getElementById("userid").focus();
		return false;
	}
	
	if(pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		pwd.focus();
		return false;
	}
	
	var pwdCheck = /^(?=.*[a=zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8.20}$/;
	
	if(!pwdCheck.test(pwd.value)) {
		alert("비밀번호는 영문자/숫자/특수문자 조합으로 8~20자리까지 설정 가능합니다.");
		pwd.focus();
		return false;
	}
	
	if(pwd_chk.value != pwd.value) {
		alert("비밀번호가 일치하지 않습니다.");
		pwd_chk.focus();
		return false;
	}
	
	if(name.value == "") {
		alert("이름을 입력하세요.");
		name.focus();
		return false;
	}
	
	if(phone.value == "") {
		alert("휴대전화번호를 입력하세요");
		phone.focus();
		return false;
	}
	
	if(email.value == "") {
		alert("이메일을 입력하세요");
		email.focus();
		return false;
	}
	
	var email_EX = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
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
 	
 	if(!agree) {
 		alert("약관 동의를 체크하세요.");
 		$('#demo-human').focus();
 		return false;
 	}
 	else {
 		alert("회원가입이 완료되었습니다.");
 		return true;
 	}
 }				