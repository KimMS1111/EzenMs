function check(){
	
	if (document.frm.name.value == "") {
		alert("이름을 입력해주세요.");
		document.frm.name.focus();
		return false;
	}else if (document.frm.age.value == "") {
		alert("생년월일을 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if (isNaN(document.frm.age.value)) {
		alert("숫자로 입력해주세요.");
		document.frm.age.focus();
		return false;
	}else if (document.frm.userid.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.userid.focus();
		return false;	
	}else if (document.frm.userpw.value == "") {
		alert("비밀번호를 입력해주세요.");
		document.frm.userpw.focus();
		return false;
	}else if (isNaN(document.frm.userpw.value)) {
		alert("숫자로 입력해주세요.");
		document.frm.userpw.focus();
		return false;
	}else {
		return true;
	}
}