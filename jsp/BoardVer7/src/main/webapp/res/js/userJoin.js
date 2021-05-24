var frmElem = document.querySelector('#frm');
var uidElem = frmElem.uid;
var upwElem = frmElem.upw;
var chkUpwElem = frmElem.chkUpw;
var unmElem = frmElem.unm;
var chkUidResultElem = frmElem.querySelector('#chkUidResult');

var btnChkIdElem = frmElem.btnChkId; // frmElem.querySelector('#btnChkId');

// JS 이벤트 바인딩 : addEventListener, .on ~
// .on ~html에서 on~ 이벤트 준 것과 같은 효과
// addEventListener
btnChkIdElem.addEventListener('click', function() {
	console.log('onclick 이벤트 추가!');
	idChkAjax(uidElem.value);
});

function idChkAjax(uid) {
	console.log(uid);

	// AJAX 통신은 화면 전환 없이 데이터만 주고받음!
	// 요청, 응답 무조건 JSON 객체 
	// JSON - {}중괄호 안에 작성, 멤버 필드와 문자열 값 쌍따옴표로 묶음
	
	// 서블릿 주소, default : get 방식
	fetch('/user/idChk?uid=' + uid)
	.then(function(res) {
		return res.json();
	})
	.then(function(myJson) {
		console.log(myJson);

		switch(myJson.result) {
			case 0:
				chkUidResultElem.innerText = '이 아이디는 사용할 수 있습니다.';
				break;
			case 1:
				chkUidResultElem.innerText = '이 아이디는 사용할 수 없습니다.';
				break;
		}
	});
};

function frmChk() {
	// 이상이 생기면 return false
	var uidVal = uidElem.value; 
	var upwVal = upwElem.value;
	var chkUpwVal = chkUpwElem.value;

	// 아이디 한 글자도 없으면 alert('아이디를 작성해 주세요.'); return false;
	// 2자 이하면 alert('아이디는 3글자 이상 작성해 주세요.'); return false;
	
	if(uidVal.length <= 2) {
		if(uidVal.length == 0) {
			alert('아이디를 작성해 주세요.');
		} else {
			alert('아이디는 3글자 이상 작성해 주세요.'); 
		}
		return false;
	}

	// 비밀번호 한 글자도 없으면 alert('비밀번호를 작성해 주세요.'); return false;
	// 3자 이하면 alert('비밀번호는 4글자 이상 작성해 주세요.'); return false;
	// 비밀번호와 확인비밀번호가 다르면 alert('비밀번호를 확인해 주세요'); return false;
	if(uidVal.length <= 3) {
		if(uidVal.length == 0) {
			alert('비밀번호를 작성해 주세요.');
		} else {
			alert('비밀번호는 4글자 이상 작성해 주세요.'); 
		}
		return false;
	} else if(upwVal !== chkUpwVal) {
		alert('비밀번호를 확인해 주세요'); 
		return false;
	}
	
	if(unmElem.value.length < 2) {
		alert('이름은 두 글자 이상 작성해 주세요.');
		return false;
	}

	console.log(uidVal);
	console.log(upwVal);
	console.log(unmVal);
}
