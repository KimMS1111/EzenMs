function InsetMemberCheck(){
	if(document.frmM.member_seq.value.length == 0){
		alert('순번이 입력되지 않았습니다.');
		frmM.member_seq.focus();
		return false;
	}
	if(document.frmM.c_no.value == ""){
		alert('과정코드가 입력되지 않았습니다.');
		frmM.c_no.focus();
		return false;
	}
	if(document.frmM.c_name.value == ""){
		alert('수강생명이 입력되지 않았습니다.');
		frmM.c_name.focus();
		return false;
	}
	if(document.frmM.phone.value == ""){
		alert('전화번호가 입력되지 않았습니다.');
		frmM.phone.focus();
		return false;
	}
	if(document.frmM.address.value.length == 0){
		alert('주소가 입력되지 않았습니다.');
		frmM.address.focus();
		return false;
	}
	if(document.frmM.regist_date.value == ""){
		alert('수강등록일이 입력되지 않았습니다.');
		frmM.regist_date.focus();
		return false;
	}
	if(document.frmM.c_type.value == ""){
		alert('수강등급이 입력되지 않았습니다.');
		frmM.c_type.focus();
		return false;
	}
}