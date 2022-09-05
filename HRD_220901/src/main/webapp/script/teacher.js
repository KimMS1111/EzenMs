function InsetTeacherCheck(){
	if(document.frmT.teacher_seq.value.length == 0){
		alert('순번이 입력되지 않았습니다.');
		frmT.teacher_seq.focus();
		return false;
	}
	if(document.frmT.teacher_code.value == ""){
		alert('교사코드가 입력되지 않았습니다.');
		frmT.teacher_code.focus();
		return false;
	}
	if(document.frmT.class_name.value == ""){
		alert('담당과정명이 입력되지 않았습니다.');
		frmT.class_name.focus();
		return false;
	}
	if(document.frmT.teacher_name.value == ""){
		alert('교사명이 입력되지 않았습니다.');
		frmT.teacher_name.focus();
		return false;
	}
	if(document.frmT.class_price.value.length == 0){
		alert('배정금액이 입력되지 않았습니다.');
		frmT.class_price.focus();
		return false;
	}
	if(document.frmT.teacher_regist_date.value == ""){
		alert('등록일이 입력되지 않았습니다.');
		frmT.teacher_regist_date.focus();
		return false;
	}
}